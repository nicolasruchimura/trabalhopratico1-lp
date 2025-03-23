package com.conversorUnidades.utils;

public class conversorTemperatura {
    public static String converterTemperatura(double valor, String unidadeOrigem, String unidadeDestino) {
        double resultado = 0;

        switch (unidadeOrigem.toLowerCase()) {
            case "c":
                if (unidadeDestino.equalsIgnoreCase("f")) resultado = (valor * 9/5) + 32;
                else if (unidadeDestino.equalsIgnoreCase("k")) resultado = valor + 273.15;
                else resultado = valor;
                break;
            case "f":
                if (unidadeDestino.equalsIgnoreCase("c")) resultado = (valor - 32) * 5/9;
                else if (unidadeDestino.equalsIgnoreCase("k")) resultado = (valor - 32) * 5/9 + 273.15;
                else resultado = valor;
                break;
            case "k":
                if (unidadeDestino.equalsIgnoreCase("c")) resultado = valor - 273.15;
                else if (unidadeDestino.equalsIgnoreCase("f")) resultado = (valor - 273.15) * 9/5 + 32;
                else resultado = valor;
                break;
            default:
                return "Unidade de origem inválida!";
        }

        return valor + " " + unidadeOrigem + " equivale a " + resultado + " " + unidadeDestino;
    }
}
