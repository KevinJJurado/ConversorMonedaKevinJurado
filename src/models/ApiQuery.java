package models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class ApiQuery {
    public Conversor getApi(String baseCode) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/d611f3f0b2e3d03976a04367/latest/" + baseCode);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversor.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error al realizar la solicitud a la API: " + e.getMessage(), e);
        }
    }
}
