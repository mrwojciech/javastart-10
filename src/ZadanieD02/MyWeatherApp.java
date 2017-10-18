package ZadanieD02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyWeatherApp {
    public static void main(String[] args) throws IOException {
        //String city = "wrocław";

        List<String> cities = new ArrayList<>();
        FileOperations fileOperations = new FileOperations();

        cities = fileOperations.readFile();
        WeatherInfo weatherInfo = new WeatherInfo();

        List<WeatherInfo> weatherInfos = new ArrayList<>();

        for (String city : cities) {
            try {
                WeatherApi api = new WeatherApi();
                int temperature = api.getTemperature(city);
                String description = api.getDescription(city);
                System.out.printf("Pogoda w mieście %s: %s\n", city, description);
                System.out.printf("Aktualna temperatura: %d stopni\n", temperature);
                weatherInfos.add(new WeatherInfo(city, description, temperature));
            } catch (IOException e) {
                System.err.println("Nie udało się pobrać informacji dla miasta " + city);
            }
        }

        fileOperations.saveToFile(weatherInfos);

    }


}
