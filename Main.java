import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        URL yahoo = new URL("https://api.weather.gov/points/39.7456,-97.0892");
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}