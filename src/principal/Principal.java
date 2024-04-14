package principal;

import calculations.CurrencyConversor;
import models.ApiQuery;
import models.Conversor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        ApiQuery apiQuery = new ApiQuery();
        CurrencyConversor currencyConversor = new CurrencyConversor();
        Conversor conversor = apiQuery.getApi("USD");
        System.out.println("**********************************************");
        System.out.println("Sea bienvenido al Conversor de Moneda =)");
        String menu = """
                
                1) Dólar ==> Peso Argentino
                2) Peso Argentino ==> Dólar
                3) Dólar ==> Real Brasileño
                4) Real Brasileño ==> Dólar
                5) Dólar ==> Peso Colombiano
                6) Peso Colombiano ==> Dólar
                7) Euro ==> Peso Colombiano
                8) Peso Colombiano ==> Euro
                9) Salir
                Elija una opción válida;
                **********************************************
                """;
        int opcion = 0;
        double amount;
        double convertedValue;
        while (opcion != 9) {
            System.out.println(menu);
            opcion = lectura.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor que desea convertir:");
                    amount = lectura.nextDouble();
                    convertedValue = currencyConversor.Conversion(conversor, "USD", "ARS", amount);
                    System.out.println("El valor "
                            + amount + "[USD] corresponde al valor final de ==> "
                            + df.format(convertedValue) + "[ARS]");
                    break;
                case 2:
                    System.out.println("Ingrese el valor que desea convertir:");
                    amount = lectura.nextDouble();
                    convertedValue = currencyConversor.Conversion(conversor, "ARS", "USD", amount);
                    System.out.println("El valor "
                            + amount + "[ARS] corresponde al valor final de ==> "
                            + df.format(convertedValue) + "[USD]");
                    break;
                case 3:
                    System.out.println("Ingrese el valor que desea convertir:");
                    amount = lectura.nextDouble();
                    convertedValue = currencyConversor.Conversion(conversor, "USD", "BRL", amount);
                    System.out.println("El valor "
                            + amount + "[USD] corresponde al valor final de ==> "
                            + df.format(convertedValue) + "[BRL]");
                    break;
                case 4:
                    System.out.println("Ingrese el valor que desea convertir:");
                    amount = lectura.nextDouble();
                    convertedValue = currencyConversor.Conversion(conversor, "BRL", "USD", amount);
                    System.out.println("El valor "
                            + amount + "[BRL] corresponde al valor final de ==> "
                            + df.format(convertedValue) + "[USD]");
                    break;
                case 5:
                    System.out.println("Ingrese el valor que desea convertir:");
                    amount = lectura.nextDouble();
                    convertedValue = currencyConversor.Conversion(conversor, "USD", "COP", amount);
                    System.out.println("El valor "
                            + amount + "[USD] corresponde al valor final de ==> "
                            + df.format(convertedValue) + "[COP]");
                    break;
                case 6:
                    System.out.println("Ingrese el valor que desea convertir:");
                    amount = lectura.nextDouble();
                    convertedValue = currencyConversor.Conversion(conversor, "COP", "USD", amount);
                    System.out.println("El valor "
                            + amount + "[COP] corresponde al valor final de ==> "
                            + df.format(convertedValue) + "[USD]");
                    break;
                case 7:
                    System.out.println("Ingrese el valor que desea convertir:");
                    amount = lectura.nextDouble();
                    convertedValue = currencyConversor.Conversion(conversor, "EUR", "COP", amount);
                    System.out.println("El valor "
                            + amount + "[EUR] corresponde al valor final de ==> "
                            + df.format(convertedValue) + "[COP]");
                    break;
                case 8:
                    System.out.println("Ingrese el valor que desea convertir:");
                    amount = lectura.nextDouble();
                    convertedValue = currencyConversor.Conversion(conversor, "COP", "EUR", amount);
                    System.out.println("El valor "
                            + amount + "[COP] corresponde al valor final de ==> "
                            + df.format(convertedValue) + "[EUR]");
                    break;
                case 9:
                    System.out.println("Gracias por usar el conversor de Moneda");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }
}
