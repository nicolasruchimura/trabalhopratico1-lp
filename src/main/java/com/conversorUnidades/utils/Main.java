package com.conversorUnidades.utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*O modelo condicional 'while(true){}' implica em um programa que encerra somente com uma chamada.*/
        while (true) {
            System.out.println("\nSelecione o tipo de conversão que deseja:");
            System.out.println("1. Temperatura");
            System.out.println("2. Distância");
            System.out.println("3. Velocidade");
            System.out.println("4. Área");
            System.out.println("0. Sair");
            System.out.println("\n");

            int escolha = sc.nextInt();
            sc.nextLine();                              /*Cabe ao 'ENTER', que contaria como sc*/
                                                        /*sc.nexInt provém da biblioteca Scanner sc e armazena um inteiro.*/
            if (escolha == 0) {
                System.out.println("Saindo...");
                break;
            }
/**
 * @valor = input do usuario - seria o valor da temperatura, velocidade, ...
 */
            System.out.println("\nInforme o valor:");
            double valor = Double.parseDouble(sc.nextLine());

            System.out.println("Informe a unidade de origem:");
            String unidadeOrigem = sc.nextLine();

            System.out.println("Informe a unidade de destino:");
            String unidadeDestino = sc.nextLine();

            switch (escolha) {
                case 1:
                    conversorTemperatura.converterTemperatura(valor, unidadeOrigem, unidadeDestino);
                    break;
                case 2:
                    conversorDistancia.converterDistancia(valor, unidadeOrigem, unidadeDestino);
                    break;
                case 3:
                    conversorVelocidade.converterVelocidade(valor, unidadeOrigem, unidadeDestino);
                    break;
                case 4:
                    conversorArea.converterArea(valor, unidadeOrigem, unidadeDestino);
                    break;
                default:
                    System.out.println("Opção inválida! Escolha entre 1 e 4 ou 0 para sair.");
            }
        }

        sc.close();
    }
}
