import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDivisa {

    Divisas buscaDivisas(String monedaOrigen) {
        // Inicializar variables necesarias para la solicitud de la API
//        final String APIKEY = "a86bada53458c2d31dd4dbe9";
//        final String URL = "https://v6.exchangerate-api.com/v6/" + APIKEY + "/latest/" + monedaOrigen;

    URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a86bada53458c2d31dd4dbe9/latest/" + monedaOrigen);

            // Instanciar un nuevo cliente y una nueva solicitud
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Retorna el body de la respuesta
        String body = response.body();
            return new Gson().fromJson(body, Divisas.class);

}
}
