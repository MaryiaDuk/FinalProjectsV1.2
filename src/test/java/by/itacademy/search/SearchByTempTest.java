package by.itacademy.search;

import by.itacademy.MakeWeatherList;
import by.itacademy.weathers.Weather;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchByTempTest {
    @Test
    public void searchTest() {
        List<Weather> list = new ArrayList<>();
        List<Weather> tmp = new ArrayList<>();
        int max_t = 20;
        int min_t = 10;
        new MakeWeatherList(list).make();
        for (Weather weather : list) {
            if(weather.getMax_temp()<=max_t && weather.getMax_temp()>=min_t)tmp.add(weather);
        }
        assertEquals(new SearchByTemp().find(list, max_t, min_t), tmp);
    }
}
