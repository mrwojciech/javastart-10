package ZadanieD02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperations {

    private String FILE_NAME = "src\\ZadanieD02\\cities.txt";
    private String OUT_FILE_NAME = "cities_data.txt";
    File file = new File(FILE_NAME);
    Scanner scanner = new Scanner(file);
    List<String> cities = new ArrayList<>();

    public FileOperations() throws FileNotFoundException {
    }

    public List<String> readFile() {
        String line = null;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            cities.add(line);

        }
        scanner.close();
        return cities;
    }


    public void saveToFile(List<WeatherInfo> weatherInfos) throws IOException {
        FileWriter fileWriter = new FileWriter(OUT_FILE_NAME);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (WeatherInfo weatherInfo : weatherInfos) {
            fileWriter.write(weatherInfo.getCity() + "," + weatherInfo.getDescription() + "," + weatherInfo.getTemp()+"\n");
        }
        fileWriter.close();
        bufferedWriter.close();
    }

}
