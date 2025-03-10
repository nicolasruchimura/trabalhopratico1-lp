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

            if (escolha == 0) {
                System.out.println("...");
                break;  //  o programa encerra com a escolha ~ '0. Sair' ~
            }

            double valor;
            String unidade_temperatura;

    //  a partir de então, é utilizado o comando ~' switch '~ como facilitador de decisões.

            switch (escolha) {
                case 1:
                    System.out.println("Introduza a unidade de temperatura:");
                    unidade_temperatura = sc.nextLine();
                    System.out.println("");
            }

        }