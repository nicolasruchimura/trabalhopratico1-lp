package com.conversorUnidades.utils;
import java.util.LinkedList;
import java.util.Queue;
/**
 * FIFO significa First In, First Out - Primeiro a entrar e primeiro a sair;
 * Para isso, será utilizado o LinkedList, que facilita o processo de estruturação do List;
 * A seguir, o código, com as linhas comentadas, uma vez que há comandos do LinkedList:
 */
public class FifoBuffer<T>  // classe do tipo T (funciona para qualquer tipo de dado (integrais, string, double, ...));
{
    private Queue<T> queue = new LinkedList<>(); //assim que se cria uma fila (Queue) usando LinkedList;

    public void adicionarElemento(T elemento) // método público (pode ser invocado de qualquer lugar) com o parâmetro 'elemento';
    {
        queue.add(elemento); // adiciona o elemento (no final da fila, por seguir padrões de ordem);
    }

    public T removerElemento() // agora um metodo para remover o elemento (como pedido); T é o tipo de valor que retorna. O método não recebe parâmetros;
    {
        return queue.poll(); // de acordo com o LinkedList, o comando .poll() retorna e remove o elemento do final do container;
    }

    public void listarElementos()
    {
        System.out.println("Fila (FIFO): " + queue);
    }
}
/**
 * Ao final, percebemos a utilidade de FIFO:
 * Cria um Array ordenado, ao qual conseguimos manipular suas pontas -> removendo e adicionando elementos.
 */