package project;

import project.enums.Periods;
import project.entity.WeatherData;

import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException;

    WeatherData getAllFromDb() throws IOException;
}
