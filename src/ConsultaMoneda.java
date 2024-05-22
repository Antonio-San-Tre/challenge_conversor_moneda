import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    String textoJson;
    Moneda moneda;

    public Moneda convierteMoneda () throws IOException, InterruptedException {

        var monedaBase = "USD";
        var monedaDestino = "MXN";

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/325d0e299d9d8e34c6a9567e/pair/"
                +monedaBase+"/"+monedaDestino);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        textoJson = response.body();
        Gson gson = new Gson();
        moneda = gson.fromJson(response.body(), Moneda.class);

        return moneda;
    }

    public Moneda convierteMoneda1 () throws IOException, InterruptedException {

        var monedaBase = "MXN";
        var monedaDestino = "USD";

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/325d0e299d9d8e34c6a9567e/pair/"
                +monedaBase+"/"+monedaDestino);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        textoJson = response.body();
        Gson gson = new Gson();
        moneda = gson.fromJson(response.body(), Moneda.class);

        return moneda;
    }

    public Moneda convierteMoneda2 () throws IOException, InterruptedException {

        var monedaBase = "USD";
        var monedaDestino = "ARS";

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/325d0e299d9d8e34c6a9567e/pair/"
                +monedaBase+"/"+monedaDestino);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        textoJson = response.body();
        Gson gson = new Gson();
        moneda = gson.fromJson(response.body(), Moneda.class);

        return moneda;
    }

    public Moneda convierteMoneda3 () throws IOException, InterruptedException {

        var monedaBase = "ARS";
        var monedaDestino = "USD";

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/325d0e299d9d8e34c6a9567e/pair/"
                +monedaBase+"/"+monedaDestino);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        textoJson = response.body();
        Gson gson = new Gson();
        moneda = gson.fromJson(response.body(), Moneda.class);

        return moneda;
    }

    public Moneda convierteMoneda4 () throws IOException, InterruptedException {

        var monedaBase = "USD";
        var monedaDestino = "EUR";

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/325d0e299d9d8e34c6a9567e/pair/"
                +monedaBase+"/"+monedaDestino);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        textoJson = response.body();
        Gson gson = new Gson();
        moneda = gson.fromJson(response.body(), Moneda.class);

        return moneda;
    }

    public Moneda convierteMoneda5 () throws IOException, InterruptedException {

        var monedaBase = "EUR";
        var monedaDestino = "USD";

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/325d0e299d9d8e34c6a9567e/pair/"
                +monedaBase+"/"+monedaDestino);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        textoJson = response.body();
        Gson gson = new Gson();
        moneda = gson.fromJson(response.body(), Moneda.class);

        return moneda;
    }






}
