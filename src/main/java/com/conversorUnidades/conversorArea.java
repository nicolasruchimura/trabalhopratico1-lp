package com.conversorUnidades;

public class conversorArea {
    public static void converterArea(double valor, String unidadeOrigem, String unidadeDestino) {
        double metrosQuadrados, quilometrosQuadrados, hectares, acres;

        switch (unidadeOrigem.toLowerCase()) {
            case "m2":
                metrosQuadrados = valor;
                quilometrosQuadrados = metrosQuadrados / 1_000_000;
                hectares = metrosQuadrados / 10_000;
                acres = metrosQuadrados / 4046.86;
                break;

            case "km2":
                quilometrosQuadrados = valor;
                metrosQuadrados = quilometrosQuadrados * 1_000_000;
                hectares = quilometrosQuadrados * 100;
                acres = quilometrosQuadrados * 247.105;
                break;

            case "ha":
                hectares = valor;
                metrosQuadrados = hectares * 10_000;
                quilometrosQuadrados = hectares / 100;
                acres = hectares * 2.47105;
                break;

            case "ac":
                acres = valor;
                metrosQuadrados = acres * 4046.86;
                quilometrosQuadrados = metrosQuadrados / 1_000_000;
                hectares = metrosQuadrados / 10_000;
                break;

            default:
                System.out.println("Unidade inválida! Use 'm2', 'km2', 'ha' ou 'ac'.");
                return;
        }

        System.out.println("\nConversões:");
        if (unidadeDestino.equals("m2")) {
            System.out.printf("Metros quadrados -> %.3f m²\n", metrosQuadrados);
        }
        if (unidadeDestino.equals("km2")) {
            System.out.printf("Quilômetros quadrados -> %.6f km²\n", quilometrosQuadrados);
        }
        if (unidadeDestino.equals("ha")) {
            System.out.printf("Hectares -> %.3f ha\n", hectares);
        }
        if (unidadeDestino.equals("ac")) {
            System.out.printf("Acres -> %.3f ac\n", acres);
        }
    }
}
