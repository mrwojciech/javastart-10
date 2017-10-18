package ZadanieD02;

import java.io.Serializable;

public class WeatherInfo implements Serializable{

    private String city;
    private String description;
    private int temp;

    public WeatherInfo(String city, String description, int temp) {
        this.city = city;
        this.description = description;
        this.temp = temp;
    }

    public WeatherInfo() {

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
