package com.conversorUnidades.utils;

public class conversorDistancia {
    public static String converterDistancia(double valor, String unidadeOrigem, String unidadeDestino) {
        double metros = 0;

        switch (unidadeOrigem.toLowerCase()) {
            case "m":
                metros = valor;
                break;
            case "km":
                metros = valor * 1000;
                break;
            case "mi":
                metros = valor * 1609.34;
                break;
            case "yd":
                metros = valor * 0.9144;
                break;
            default:
                return "Unidade de origem inválida!";
        }

        double resultado = 0;
        switch (unidadeDestino.toLowerCase()) {
            case "m":
                resultado = metros;
                break;
            case "km":
                resultado = metros / 1000;
                break;
            case "mi":
                resultado = metros / 1609.34;
                break;
            case "yd":
                resultado = metros / 0.9144;
                break;
            default:
                return "Unidade de destino inválida!";
        }

        return valor + " " + unidadeOrigem + " equivale a " + resultado + " " + unidadeDestino;
    }
}
