package com.conversorUnidades.utils;

public class conversorVelocidade {
    public static void converterVelocidade(double valor, String unidadeOrigem, String unidadeDestino) {
        double metrosPorSegundo, quilometrosPorHora, milhasPorHora;

        switch (unidadeOrigem.toLowerCase()) {
            case "mps":
                metrosPorSegundo = valor;
                quilometrosPorHora = metrosPorSegundo * 3.6;
                milhasPorHora = metrosPorSegundo * 2.23694;
                break;

            case "kmh":
                quilometrosPorHora = valor;
                metrosPorSegundo = quilometrosPorHora / 3.6;
                milhasPorHora = metrosPorSegundo * 2.23694;
                break;

            case "mph":
                milhasPorHora = valor;
                metrosPorSegundo = milhasPorHora / 2.23694;
                quilometrosPorHora = metrosPorSegundo * 3.6;
                break;

            default:
                System.out.println("Unidade inválida! Use 'mps', 'kmh' ou 'mph'.");
                return;
        }

        System.out.println("\nConversões:");
        if (unidadeDestino.equals("mps")) {
            System.out.printf("Metros por segundo -> %.3f m/s\n", metrosPorSegundo);
        }
        if (unidadeDestino.equals("kmh")) {
            System.out.printf("Quilômetros por hora -> %.3f km/h\n", quilometrosPorHora);
        }
        if (unidadeDestino.equals("mph")) {
            System.out.printf("Milhas por hora -> %.3f mph\n", milhasPorHora);
        }
    }
}
