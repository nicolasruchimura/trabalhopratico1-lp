package com.conversorUnidades;

public class conversorDistancia {

    public static void converterDistancia(double valor, String unidade) {
        double metros, quilometros, milhas, jardas;

        switch (unidade.toLowerCase()) {
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
                System.out.println("Unidade inválida! Use 'm' (metros), 'km' (quilômetros), 'mi' (milhas) ou 'yd' (jardas).");
                return;
        }

        System.out.println("\nConversões:");
        System.out.printf("Metros -> %.3f", metros);
        System.out.printf("\n");
        System.out.printf("Quilômetros -> %.3f", quilometros);
        System.out.printf("\n");
        System.out.printf("Milhas -> %.3f", milhas);
        System.out.printf("\n");
        System.out.printf("Jardas -> %.3f", jardas);
        System.out.printf("\n");
    }
}
