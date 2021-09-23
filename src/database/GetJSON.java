package database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GetJSON {

    private static String USGS_REQUEST_URL = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2012-01-01&endtime=2012-12-01&minmagnitude=6";

    public static void main(String args[]) {
//        Get JSON data from the URL
        try {
            URL url = new URL(USGS_REQUEST_URL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            InputStream inputStream = con.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);

            StringBuilder JSON_DATA = new StringBuilder();

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            while (true) {
                String line = bufferedReader.readLine();
                if(line == null)
                    break;
                JSON_DATA.append(line);
            }

            System.out.println(JSON_DATA);
            con.disconnect();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
