import java.util.Map;

public class MoneyChange {
    private String base_code;  // Moneda base (por ejemplo, PEN)
    private Map<String, Double> conversion_rates;  // Mapa con las tasas de cambio

    // Getters y Setters
    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    @Override
    public String toString() {
        return "Base Code: " + base_code + "\nConversion Rates: " + conversion_rates;
    }
}
