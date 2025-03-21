<h1>Projeto Prático Laboratórios de Programação</h1>
<h4>~ Nicolas Uchimura</h4>
<hr>

**Objetivo**: Fazer uma biblioteca em Java com funcionalidades de conversão de unidades e manipulação de estrutura de dados com LIFO e FIFO.<br>
**Ferramentas utilizadas**:  Visual Studio Code + Git + pesquisas a parte sobre LIFO e FIFO + IntelliJ para estruturação de packages, classes e biblioteca;
<hr>
<h1>Introdução</h1>
  O projeto tem como objetivo criar uma biblioteca UtilsLibrary.jar, de modo que seja importada em qualquer projeto (java class), permitindo que o utilizador aceda a biblioteca de conversão de unidades, LIFO e FIFO (UtilsLibrary).
  A partir do IntelliJ, houve a criação de src/main/java/ */package/* > com.ConversorUnidades.utils; A partir de então, foram criadas as classes de conversão de unidades, para cada tipo de situação: 


    >  conversorArea
    >  conversorDistancia
    >  conversorPeso
    >  conversorTemperatura
    >  conversorVelocidade
    >  FifoBuffer
    >  LifoBuffer
    >  Main

  Main > classe a qual reúne todas as outras.
<hr>

**LIFO/FIFO** **BUFFER**

- Foram utilizados dois métodos para programar o FIFO e o LIFO buffer. Para FIFO, foi utilizado o __LinkedList__, já para o LIFO, o método de arrays. Assim, fica mais fácil de visualizar o método mais rápido e prático e um outro mais detalhado.
  
  Lifo Buffer > Last In, First Out > Adicionar o último é elimina-lo primeiro;
      No Lifo Buffer, foi utilizado o método de array/pilha. O método, apesar de trabalhoso, acaba por apresentar de maneira mais detalhada os processos do Lifo Buffer, de incrementar/remover/retornar valores.
  Fifo Buffer > First In, First Out - Primeiro a entrar e primeiro a sair;
      Para isso, será utilizado o LinkedList, que facilita o processo de estruturação do List; O método reúne uma maneira simplificada e rápida de organizar os processos de incrementar/remover/retornar valores, com apenas alguns comandos mais "traduzidos".
