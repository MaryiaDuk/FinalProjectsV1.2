package by.itacademy.parsing.parsingJSON;

import by.itacademy.exceptions.ReadingOnlineBaseException;
import by.itacademy.parsing.ParseFiles;
import by.itacademy.weathers.Weather;
import by.itacademy.weathers.WeatherList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;
import java.util.*;

public class ParsingJSON implements ParseFiles {
    private List<Weather> weatherList = new ArrayList<>();
    private Gson gson = new GsonBuilder().setPrettyPrinting()
            .registerTypeAdapter(Weather.class, new WeatherJSONDeserializer()).create();

    @Override
    public List<Weather> read() throws ReadingOnlineBaseException {
        try {
            URL url = new URL("https://raw.githubusercontent.com/MaryiaDuk/weather/master/weather1.json");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            WeatherList weather = gson.fromJson(new BufferedReader
                    (new InputStreamReader(connection.getInputStream())), WeatherList.class);
            weatherList = weather.getPlace();
            connection.disconnect();
            return weatherList;
        } catch (IOException e) {
            throw new ReadingOnlineBaseException(e);
        }
    }
}