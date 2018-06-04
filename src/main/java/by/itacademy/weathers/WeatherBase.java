package by.itacademy.weathers;

import by.itacademy.annotations.Bean;
import by.itacademy.exceptions.ReadingOnlineBaseException;
import by.itacademy.threads.ParseJSONThread;
import by.itacademy.threads.ParseXMLThread;

import java.util.ArrayList;
import java.util.List;

@Bean(name = "База погоды")
public class WeatherBase {
    private List<Weather> weatherBase = new ArrayList<>();
    private static WeatherBase instance = null;

    private WeatherBase() {
    }

    public static WeatherBase getInstance() {
        if (instance == null) instance = new WeatherBase();
        return instance;
    }

    public List<Weather> create() throws ReadingOnlineBaseException {
        try {
            ParseXMLThread xmlThreads = new ParseXMLThread();
            ParseJSONThread jsonThread = new ParseJSONThread();
            xmlThreads.getThread().join();
            weatherBase.addAll(xmlThreads.getList());
            jsonThread.getThread().join();
            weatherBase.addAll(jsonThread.getList());
            return weatherBase;
        } catch (InterruptedException e) {
            throw new ReadingOnlineBaseException(e);
        }
    }

    public List<Weather> getWeatherBase() {
        return weatherBase;
    }
}