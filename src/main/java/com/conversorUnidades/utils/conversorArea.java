package com.conversorUnidades.utils;

public class conversorArea {
    public static String converterArea(double valor, String unidadeOrigem, String unidadeDestino) {
        double metrosQuadrados = 0;

        switch (unidadeOrigem.toLowerCase()) {
            case "m²":
                metrosQuadrados = valor;
                break;
            case "km²":
                metrosQuadrados = valor * 1_000_000;
                break;
            case "ha":
                metrosQuadrados = valor * 10_000;
                break;
            case "ac":
                metrosQuadrados = valor * 4046.86;
                break;
            default:
                return "Unidade de origem inválida!";
        }

        double resultado = 0;
        switch (unidadeDestino.toLowerCase()) {
            case "m²":
                resultado = metrosQuadrados;
                break;
            case "km²":
                resultado = metrosQuadrados / 1_000_000;
                break;
            case "ha":
                resultado = metrosQuadrados / 10_000;
                break;
            case "ac":
                resultado = metrosQuadrados / 4046.86;
                break;
            default:
                return "Unidade de destino inválida!";
        }

        return valor + " " + unidadeOrigem + " equivale a " + resultado + " " + unidadeDestino;
    }
}
