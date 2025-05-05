import com.google.gson.Gson;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.URI;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Monedas buscaMoneda ( String monedaBase, String monedaDestino, double valorAConvertir){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/0285e1c894d9a435136ea95c/pair/" + monedaBase + "/"+ monedaDestino + "/" + valorAConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response;

        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

        } catch (Exception e){
            throw new RuntimeException("No se encontro esa moneda.");
        }

        return new Gson().fromJson(response.body(), Monedas.class);

    }
}
