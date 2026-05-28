import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class FRIDAYWeather {
    public String weatherInFriday(String city){
        try {
            String apiKey = "adef9d46bd407a7a25d7941cd8376073";
            
            String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

            URL url = new URL(urlString);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader read = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = read.readLine()) != null) {
                response.append(line);
            }

            read.close();

            JSONObject json = new JSONObject(response.toString());

            String weather = json.getJSONArray("weather").getJSONObject(0).getString("description");

            double temperature = json.getJSONObject("main").getDouble("temp");

            return "Weather in " + city + " is " + weather + " with temparature " + temperature + "°C";


        } catch (Exception e) {
            return "unable to fetch weather for " + city + ".";
        }
    }
}
