import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class GoogleWebRequestExample {

    public static void main(String[] args) {
        String urlToFetch = "https://www.google.com"; // Replace with the desired URL
        String htmlFilePath = "google.html"; // Replace with the desired file path

        try {
            // Create a URL object and open a connection
            URL url = new URL(urlToFetch);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set up the connection parameters
            connection.setRequestMethod("GET");
            connection.connect();

            // Read the response
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    response.append(line);
                }
                bufferedReader.close();

                // Write the response to an HTML file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(htmlFilePath))) {
                    writer.write(response.toString());
                    System.out.println("HTML content written to " + htmlFilePath);
                }

                // Or you can choose to buffer the response data
                // String bufferedResponse = response.toString();
                // System.out.println(bufferedResponse);
            } else {
                System.out.println("HTTP request failed with response code: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
