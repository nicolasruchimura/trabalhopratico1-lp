package com.conversorUnidades.utils;

public class conversorPeso {
    public static String converterPeso(double valor, String unidadeOrigem, String unidadeDestino) {
        double gramas = 0;

        switch (unidadeOrigem.toLowerCase()) {
            case "g":
                gramas = valor;
                break;
            case "kg":
                gramas = valor * 1000;
                break;
            case "lb":
                gramas = valor * 453.592;
                break;
            case "oz":
                gramas = valor * 28.3495;
                break;
            default:
                return "Unidade de origem inválida!";
        }

        double resultado = 0;
        switch (unidadeDestino.toLowerCase()) {
            case "g":
                resultado = gramas;
                break;
            case "kg":
                resultado = gramas / 1000;
                break;
            case "lb":
                resultado = gramas / 453.592;
                break;
            case "oz":
                resultado = gramas / 28.3495;
                break;
            default:
                return "Unidade de destino inválida!";
        }

        return valor + " " + unidadeOrigem + " equivale a " + resultado + " " + unidadeDestino;
    }
}
