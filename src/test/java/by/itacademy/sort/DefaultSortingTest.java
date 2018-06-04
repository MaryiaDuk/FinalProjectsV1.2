package by.itacademy.sort;

import by.itacademy.MakeWeatherList;
import by.itacademy.weathers.Weather;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import static org.junit.Assert.assertNotEquals;

public class DefaultSortingTest {

    @Test
    public void defSortTest() {
        List<Weather> list = new ArrayList<>();
        TreeSet<Weather> sortedList = new TreeSet<Weather>(new DefaultSorting());
        list.addAll(new MakeWeatherList(list).make());
        sortedList.addAll(list);
        assertNotEquals(list, new ArrayList<Weather>(sortedList));
    }
}
