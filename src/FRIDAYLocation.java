import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class FRIDAYLocation {

    public String getLocation() {
        try {
            String apiKey = "c34f64be3d41c1";
            String urlStr = "https://ipinfo.io/json?token=" + apiKey;

            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader read = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = read.readLine()) != null) {
                response.append(line);
            }

            read.close();

            JSONObject json = new JSONObject(response.toString());

            String city = json.getString("city");
            String region = json.getString("region");
            String country = json.getString("country");

            return city + ", " + region + ", " + country;

        } catch (Exception e) {
            return "Location not found!";
        }
    }
}