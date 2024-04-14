package calculations;

import models.Conversor;

import java.util.Map;

public class CurrencyConversor {
    public double Conversion(Conversor conversor, String originCurrency, String destinationCurrency , double amount) {
        Map<String, Double> conversionRate = conversor.conversion_rates();

        if (!conversionRate.containsKey(originCurrency) || !conversionRate.containsKey(destinationCurrency)) {
            throw new IllegalArgumentException("Las monedas no son validas");
        }

        double originRate = conversionRate.get(originCurrency);
        double destinationRate = conversionRate.get(destinationCurrency);

        double conversion = amount * destinationRate / originRate;

        return conversion;
    }
}
