package by.itacademy.menu;

import by.itacademy.annotations.Bean;
import by.itacademy.exceptions.InputException;
import by.itacademy.search.SearchByCity;
import by.itacademy.search.SearchByTemp;
import by.itacademy.weathers.Weather;
import by.itacademy.weathers.WeatherBase;

import java.util.ArrayList;
import java.util.List;

@Bean(name = "Поиск")
public class FindOperation extends InputChoice implements Operation, MenuSkin {
    private List<Weather> list = new ArrayList<>();

    private void find(int choice) throws InputException{
        list.addAll(WeatherBase.getInstance().getWeatherBase());
        if (choice == 1) {
            String name = null;
            System.out.println("Введите город:");
            try {
                name = inputName();
            }
            catch (InputException e){
                e.printStackTrace();
            }

            new SearchByCity().show(list, name);
        } else if (choice == 2) {
            System.out.println("Введите максимальную и минимальную температуры: ");
            int max = input();
            int min = input();
            new SearchByTemp().show(list, max, min);
        }
    }

    @Override
    public void execute() throws InputException {
        find(skin());
    }

    @Override
    public int skin() {
        System.out.println("Поиск :");
        System.out.println("1 - По городу.");
        System.out.println("2 - По диапозону максимальной и минимальной температур.");
        return input();
    }

    @Override
    public int input() {
        return super.input();
    }
}