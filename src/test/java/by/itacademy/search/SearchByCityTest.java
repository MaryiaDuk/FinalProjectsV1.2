package by.itacademy.search;

import by.itacademy.MakeWeatherList;
import by.itacademy.weathers.Weather;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchByCityTest {
    @Test
    public void searchTest() {
        List<Weather> list = new ArrayList<>();
        List<Weather> tmp = new ArrayList<>();
        String name = "Вена";
        new MakeWeatherList(list).make();
        for (Weather weather : list) {
            if (weather.getName().equals(name)) tmp.add(weather);
        }
        assertEquals(new SearchByCity().find(list, name), tmp);
    }
}