package com.conversorUnidades;

public class conversorDistancia {
    public static void converterDistancia(double valor, String unidadeOrigem, String unidadeDestino) {
        double metros, quilometros, milhas, jardas;

        switch (unidadeOrigem.toLowerCase()) {
            case "m":
                metros = valor;
                quilometros = metros / 1000;
                milhas = metros / 1609.34;
                jardas = metros * 1.09361;
                break;

            case "km":
                quilometros = valor;
                metros = quilometros * 1000;
                milhas = metros / 1609.34;
                jardas = metros * 1.09361;
                break;

            case "mi":
                milhas = valor;
                metros = milhas * 1609.34;
                quilometros = metros / 1000;
                jardas = metros * 1.09361;
                break;

            case "yd":
                jardas = valor;
                metros = jardas / 1.09361;
                quilometros = metros / 1000;
                milhas = metros / 1609.34;
                break;

            default:
                System.out.println("Unidade inválida! Use 'm', 'km', 'mi' ou 'yd'.");
                return;
        }

        System.out.println("\nConversões:");
        if (unidadeDestino.equals("m")) {
            System.out.printf("Metros -> %.3f m\n", metros);
        }
        if (unidadeDestino.equals("km")) {
            System.out.printf("Quilômetros -> %.3f km\n", quilometros);
        }
        if (unidadeDestino.equals("mi")) {
            System.out.printf("Milhas -> %.3f mi\n", milhas);
        }
        if (unidadeDestino.equals("yd")) {
            System.out.printf("Jardas -> %.3f yd\n", jardas);
        }
    }
}
