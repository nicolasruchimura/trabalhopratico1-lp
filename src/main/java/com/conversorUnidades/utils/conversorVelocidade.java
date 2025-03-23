package com.conversorUnidades.utils;

public class conversorVelocidade {
    public static String converterVelocidade(double valor, String unidadeOrigem, String unidadeDestino) {
        double metrosPorSegundo = 0;

        switch (unidadeOrigem.toLowerCase()) {
            case "m/s":
                metrosPorSegundo = valor;
                break;
            case "km/h":
                metrosPorSegundo = valor / 3.6;
                break;
            case "mph":
                metrosPorSegundo = valor * 0.44704;
                break;
            case "kn":
                metrosPorSegundo = valor * 0.514444;
                break;
            default:
                return "Unidade de origem inválida!";
        }

        double resultado = 0;
        switch (unidadeDestino.toLowerCase()) {
            case "m/s":
                resultado = metrosPorSegundo;
                break;
            case "km/h":
                resultado = metrosPorSegundo * 3.6;
                break;
            case "mph":
                resultado = metrosPorSegundo / 0.44704;
                break;
            case "kn":
                resultado = metrosPorSegundo / 0.514444;
                break;
            default:
                return "Unidade de destino inválida!";
        }

        return valor + " " + unidadeOrigem + " equivale a " + resultado + " " + unidadeDestino;
    }
}
