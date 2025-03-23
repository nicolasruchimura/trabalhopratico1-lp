package com.conversorUnidades.utils;

public class conversorTemperatura {
    public static String converterTemperatura(double valor, String unidadeOrigem, String unidadeDestino) {
        double resultado;
        unidadeOrigem = unidadeOrigem.toUpperCase();
        unidadeDestino = unidadeDestino.toUpperCase();

        switch (unidadeOrigem) {
            case "C":
                switch (unidadeDestino) {
                    case "F": resultado = (valor * 9 / 5) + 32; break;
                    case "K": resultado = valor + 273.15; break;
                    case "C": return String.format("%.2f °C equivale a %.2f °C", valor, valor);
                    default: return "Unidade de destino inválida!";
                }
                break;
            case "F":
                switch (unidadeDestino) {
                    case "C": resultado = (valor - 32) * 5 / 9; break;
                    case "K": resultado = (valor - 32) * 5 / 9 + 273.15; break;
                    case "F": return String.format("%.2f °F equivale a %.2f °F", valor, valor);
                    default: return "Unidade de destino inválida!";
                }
                break;
            case "K":
                switch (unidadeDestino) {
                    case "C": resultado = valor - 273.15; break;
                    case "F": resultado = (valor - 273.15) * 9 / 5 + 32; break;
                    case "K": return String.format("%.2f K equivale a %.2f K", valor, valor);
                    default: return "Unidade de destino inválida!";
                }
                break;
            default:
                return "Unidade de origem inválida!";
        }

        return String.format("%.2f %s equivale a %.2f %s", valor, unidadeOrigem, resultado, unidadeDestino);
    }
}
