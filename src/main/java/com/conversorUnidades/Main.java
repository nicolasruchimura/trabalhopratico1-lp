package com.conversorUnidades;

import com.conversorUnidades.conversorDistancia;
import com.conversorUnidades.conversorTemperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // de java.util.Scanner

        while (true) {  //  faz com que o programa seja sempre executado, a não ser que haja um break.
            System.out.println("\nSelecione o tipo de conversão que deseja:");

            System.out.println("1. Temperatura");
            System.out.println("2. Distância");
            System.out.println("3. Peso");
            System.out.println("4. Tempo");
            System.out.println("5. Velocidade");
            System.out.println("6. Área");
            System.out.println("0. Sair");

            int escolha = sc.nextInt();  //  aonde será feita a escolha das opções acima e, consequentemente, a classe que será invocada.
            sc.nextLine();      //    Após a quebra de linha com o nextInt();


            if (escolha == 0) {
                System.out.println("Saindo...");
                break;  //  o programa encerra somente com a escolha ~ '0. Sair' ~
            }

            double valor;
            String unidade_temperatura;
            String unidade_distancia;

            //  a partir de então, é utilizado o comando ~' switch '~ como facilitador de decisões.

            switch (escolha) {
                case 1:
                    System.out.println("                Escolheste Conversão de Temperaturas\n");

                    System.out.println("~ Informe o valor da temperatura:");
                    valor = Double.parseDouble(sc.nextLine());

                    System.out.println("~ Introduza a unidade de temperatura (C / F / K):");
                    unidade_temperatura = sc.nextLine();

                    conversorTemperatura.converterTemperatura(valor, unidade_temperatura);
                    break;

                case 2:
                    System.out.println("                Escolheste Conversão de Unidade de Distância\n");

                    System.out.println("~ Introduza o valor da distância:");
                    valor = Double.parseDouble(sc.nextLine());

                    System.out.println("~ Introduza a unidade em que se encontra a distância acima (m / km / mi / yd):");
                    unidade_distancia = sc.nextLine();

                    conversorDistancia.converterDistancia(valor, unidade_distancia);
                    break;
            }

        }
    }
}