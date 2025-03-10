package com.conversorUnidades;

public class conversorTemperatura {
    public static void converterTemperatura(double valor, String unidade_temperatura) {
        double celsius, fahrenheit, kelvin;
    //  no programa principal, será pedida a unidade.
        switch (unidade_temperatura) {
            case "C":
                celsius = valor;
                fahrenheit = (celsius*(9/5)) + 32;
                kelvin = celsius + 273.15;
                break;
            case "F":
                fahrenheit = valor;
                celsius = (fahrenheit - 32) * 5 / 9;
                kelvin = celsius + 273.15;
                break;
            case "K":
                kelvin = valor;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 9/5) + 32;
                break;

            default:
                System.out.print("Digite uma unidade válida (C / F / K)!");
                return;
        }

        System.out.println("\nConversões:");
        System.out.printf("Celsius -> %.3f °C", celsius);
        System.out.printf("\n");
        System.out.printf("Fahrenheit -> %.3f °F", fahrenheit);
        System.out.printf("\n");
        System.out.printf("Kelvin -> %.3f K", kelvin);
        System.out.printf("\n");
    }
}
