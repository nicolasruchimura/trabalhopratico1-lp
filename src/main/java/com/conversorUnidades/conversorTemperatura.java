package com.conversorUnidades;

public class conversorTemperatura {
    public static void converterTemperatura(double valor, String unidadeOrigem, String unidadeDestino) {
        double celsius = 0, fahrenheit = 0, kelvin = 0;

        switch (unidadeOrigem) {
            case "C":
                celsius = valor;
                fahrenheit = (celsius * (9.0 / 5)) + 32;
                kelvin = celsius + 273.15;
                break;
            case "F":
                fahrenheit = valor;
                celsius = (fahrenheit - 32) * (5.0 / 9);
                kelvin = celsius + 273.15;
                break;
            case "K":
                kelvin = valor;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * (9.0 / 5)) + 32;
                break;
            default:
                System.out.println("Digite uma unidade válida (C / F / K)!");
                return;
        }

        System.out.println("\nConversão:");
        if (unidadeDestino.equals("C")) {
            System.out.printf("Celsius => %.3f °C\n", celsius);
        }
        if (unidadeDestino.equals("F")) {
            System.out.printf("Fahrenheit => %.3f °F\n", fahrenheit);
        }
        if (unidadeDestino.equals("K")) {
            System.out.printf("Kelvin => %.3f K\n", kelvin);
        }
    }
}
