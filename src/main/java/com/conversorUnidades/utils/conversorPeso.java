package com.conversorUnidades.utils;

public class conversorPeso
        {
    public static void converterPeso(double valor_peso, String unidade_peso)
    {
        double g, kg, lb, oz;

        switch (unidade_peso.toLowerCase())
        {
            case "g":
                g = valor_peso;
                kg = g / 1000;
                lb = g * 0.002;
                oz = g * 0.035;
            break;
            case "kg":
                kg = valor_peso;
                g = kg * 1000;
                lb = kg * 2.204;
                oz = kg * 35.273;
            break;
            case "lb":
                lb = valor_peso;
                g = lb * 453.592;
                kg = lb * 0.453;
                oz = lb * 16;
            break;
            case "oz":
                oz = valor_peso;
                g = oz * 28.349;
                kg = oz * 0.028;
                lb = oz * 0.062;
            break;
            default:
                System.out.println("Unidade inválida! Use 'g' (gramas), 'kg' (quilogramas), 'lb' (libras) ou 'oz' (onças).");
            return;
        }
        System.out.println("\nConversões:");
        System.out.printf("Gramas -> %.3f g", g);
        System.out.printf("\n");
        System.out.printf("Quilogramas -> %.3f kg", kg);
        System.out.printf("\n");
        System.out.printf("Libras -> %.3f lb", lb);
        System.out.printf("\n");
        System.out.printf("Onças -> %.3f oz", oz);
        System.out.printf("\n");
    }
}
