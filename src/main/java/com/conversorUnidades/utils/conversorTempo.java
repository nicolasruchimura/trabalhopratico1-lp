package com.conversorUnidades.utils;

public class conversorTempo {
    public static String converterTempo(double valor, String unidadeOrigem, String unidadeDestino) {
        double segundos = 0;

        switch (unidadeOrigem.toLowerCase()) {
            case "s":
                segundos = valor;
                break;
            case "min":
                segundos = valor * 60;
                break;
            case "h":
                segundos = valor * 3600;
                break;
            case "d":
                segundos = valor * 86400;
                break;
            default:
                return "Unidade de origem inválida!";
        }

        double resultado = 0;
        switch (unidadeDestino.toLowerCase()) {
            case "s":
                resultado = segundos;
                break;
            case "min":
                resultado = segundos / 60;
                break;
            case "h":
                resultado = segundos / 3600;
                break;
            case "d":
                resultado = segundos / 86400;
                break;
            default:
                return "Unidade de destino inválida!";
        }

        return valor + " " + unidadeOrigem + " equivale a " + resultado + " " + unidadeDestino;
    }
}
