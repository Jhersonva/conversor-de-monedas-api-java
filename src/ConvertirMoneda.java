import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvertirMoneda {

    public double convertirMoneda(double cantidad, String opcion) throws IOException, InterruptedException {
        // Realizar la solicitud a la API para obtener las tasas de cambio
        String json = obtenerTasasDeCambio();

        // Parsear el JSON y obtener las tasas de cambio
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
        JsonObject conversionRatesObject = jsonObject.getAsJsonObject("conversion_rates");

        // Crear una instancia de ApiResponse con las tasas de cambio obtenidas
        ApiResponse response = new ApiResponse(conversionRatesObject);

        // Variables para almacenar las tasas de conversión
        double tasaConversion = 0.0;
        String monedaOrigen = "";
        String monedaDestino = "";

        // Establecer las monedas de origen y destino según la opción seleccionada
        switch (opcion) {
            case "1":
                monedaOrigen = "USD";
                monedaDestino = "ARS";
                break;
            case "2":
                monedaOrigen = "ARS";
                monedaDestino = "USD";
                break;
            case "3":
                monedaOrigen = "USD";
                monedaDestino = "BRL";
                break;
            case "4":
                monedaOrigen = "BRL";
                monedaDestino = "USD";
                break;
            case "5":
                monedaOrigen = "USD";
                monedaDestino = "COP";
                break;
            case "6":
                monedaOrigen = "COP";
                monedaDestino = "USD";
                break;
            case "7":
                monedaOrigen = "PEN";
                monedaDestino = "USD";
                break;
            case "8":
                monedaOrigen = "USD";
                monedaDestino = "PEN";
                break;
            case "9":
                // Si la opción es "9", salir del programa
                System.exit(0);
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }

        // Obtener la tasa de conversión según las monedas de origen y destino
        tasaConversion = response.getConversionRate(monedaOrigen, monedaDestino);
        System.out.println("Resultado de la conversión: " + monedaOrigen + " => " +  monedaDestino);

        // Calcular el monto convertido
        return cantidad * tasaConversion;

    }

    private String obtenerTasasDeCambio() throws IOException, InterruptedException {
        URI uri = URI.create("https://v6.exchangerate-api.com/v6/a1775d4b5cdda5d833d74e9d/latest/USD");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    // Clase ApiResponse
    static class ApiResponse {
        private JsonObject conversionRates;

        // Constructor que inicializa las tasas de cambio
        public ApiResponse(JsonObject conversionRates) {
            this.conversionRates = conversionRates;
        }

        public double getConversionRate(String from, String to) {
            // Obtener la tasa de conversión de la moneda de origen a la moneda de destino
            double tasaOrigen = conversionRates.get(from).getAsDouble();
            double tasaDestino = conversionRates.get(to).getAsDouble();
            return tasaDestino / tasaOrigen;
        }
    }
}
