import java.util.Map;

public record Divisas(String base_code, Map<String, Double> conversion_rates) {

    public double getRate(String moneda){
        return conversion_rates.get(moneda);
    }



}
