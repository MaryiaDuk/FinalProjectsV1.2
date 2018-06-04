package by.itacademy;

import by.itacademy.weathers.Weather;

import java.util.ArrayList;
import java.util.List;

public class MakeWeatherList {
    private List<Weather> weathers = new ArrayList<>();

    public MakeWeatherList(List<Weather> weathers) {
        this.weathers = weathers;
    }

    public List<Weather> make(){
        weathers.add(new Weather.WeatherBuilder().setLocation("Europe")
                .setName("Вена").setMax_T("25").setMin_T("10").setHumidity("50").setDescription("rainy").getWeather());
        weathers.add(new Weather.WeatherBuilder().setLocation("Asia")
                .setName("Пекин").setMax_T("20").setMin_T("15").setDescription("rainy").setHumidity("30").getWeather());
        weathers.add(new Weather.WeatherBuilder().setLocation("Europe")
                .setName("Прага").setMax_T("20").setMin_T("8").setHumidity("30").setDescription("sunny").getWeather());
        weathers.add(new  Weather.WeatherBuilder().setLocation("Europe")
                .setName("Милан").setMax_T("20").setMin_T("8").setHumidity("30").setDescription("sunny").getWeather());
        return weathers;
    }
}
