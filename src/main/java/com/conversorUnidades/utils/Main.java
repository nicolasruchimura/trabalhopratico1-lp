package com.conversorUnidades.utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        FifoBuffer<String> historicoFIFO = new FifoBuffer<>();
        LifoBuffer<String> historicoLIFO = new LifoBuffer<>(10);

        while (true) {
            System.out.println("\nSelecione o tipo de conversão que deseja:");
            System.out.println("1. Temperatura  (Use: C ; F ; K)");
            System.out.println("2. Distância    (Use: m ; km ; mi ; yd)");
            System.out.println("3. Velocidade   (Use: m/s ; km/h ; mph; kn)");
            System.out.println("4. Área         (Use: m2 ; km2 ; ha ; ac)");
            System.out.println("5. Peso         (Use: g ; kg ; lb ; oz)");
            System.out.println("6. Tempo        (Use: s ; min ; h ; d)");
            System.out.println("0. Sair");
            System.out.println("\n");

            int escolha = sc.nextInt();
            sc.nextLine();

            if (escolha == 0) {
                System.out.println("Saindo...");
                break;
            }
// Não há motivo para aparecer ao usuário
            if (escolha == 7) {
                historicoFIFO.listarElementos();    //Lista os elementos guardados na base de dados.
                continue;
            }
            if (escolha == 8) {
                String ultimaConversao = historicoLIFO.pop();
                //  Armazena-se na nova String ultimaConversão, o históricoLifo (ou seja, a base de dados criada, com cada elemento)
                if (ultimaConversao != null) {  //  se, realmente, fora adicionado um elemento (não vazio), será impresso o que se foi desfeito!
                    System.out.println("Desfeita a última conversão: " + ultimaConversao);
                }
                continue;
            }


            System.out.println("\nInforme o valor:");
            double valor = Double.parseDouble(sc.nextLine());

            System.out.println("Informe a unidade de origem:");
            String unidadeOrigem = sc.nextLine();

            System.out.println("Informe a unidade de destino:");
            String unidadeDestino = sc.nextLine();

            String resultado = "";

            switch (escolha) {
                case 1:
                    resultado = conversorTemperatura.converterTemperatura(valor, unidadeOrigem, unidadeDestino);
                    break;
                case 2:
                    resultado = conversorDistancia.converterDistancia(valor, unidadeOrigem, unidadeDestino);
                    break;
                case 3:
                    resultado = conversorVelocidade.converterVelocidade(valor, unidadeOrigem, unidadeDestino);
                    break;
                case 4:
                    resultado = conversorArea.converterArea(valor, unidadeOrigem, unidadeDestino);
                    break;
                case 5:
                    resultado = conversorPeso.converterPeso(valor, unidadeOrigem, unidadeDestino);
                    break;
                case 6:
                    resultado = conversorTempo.converterTempo(valor, unidadeOrigem, unidadeDestino);
                    break;
                default:
                    System.out.println("Opção inválida! Escolha entre 1 e 6 ou 0 para sair.");
                    continue;
            }
            // Adicionar conversão ao histórico
            System.out.println(resultado);
            historicoFIFO.adicionarElemento(resultado);
            historicoLIFO.incrementar(resultado);
        }

        sc.close();
    }
}
