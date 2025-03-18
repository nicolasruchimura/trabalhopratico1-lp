package com.conversorUnidades.utils;
/*
 * LIFO Buffer =>   Last In, First Out
 * Adicionar o último é elimina-lo primeiro 
 */
public class LifoBuffer<T>
{
    private T[] buffer; //  Array que armazena os elementos
    private int top;    //  Topo da pilha
    private int capacidade; // Capacidade máxima da pilha

//  CONSTRUTOR    
    public LifoBuffer(int capacidade) /*Uso de 'this.' para não haver conflito de nomenclaturas*/
    {
        this.capacidade = capacidade;
        this.buffer = (T[]) new Object[capacidade]; //  Cria um array genérico Object
        this.top = -1;  // Sintaxe usada para a pilha começar vazia
    }

/*
 * Explicação Pilha começar no -1:
 *  Vamos supor que nossa pilha armazene três (3) elementos no array.   
 *  Ou seja, com o "top = -1", a disposição ficaria:    top = -1; arr[] = { , , }
 *  Após o comando "buffer.incrementar(10)":
 *  top = 0;    arr[] = {10, , }
 *  Assim, -1 seria a posição inicial da pilha, a partir da incrementação, vamos ao elemento 0 do array.
 */

//  Adiciona um elemento ao topo
    public void incrementar(T elemento)
    {
        if (estaCheio()){   //  Verificação de Buffer Cheio
            System.out.println("Buffer cheio! Não é possível adicionar.");
            return;
        }
        buffer[++top] = elemento;   //  É aonde o top = -1 passa para top = 0; 
    }
    public T pop()
    {
        if(estaVazio()){
            System.out.println("Buffer vazio! Nada a remover.");
            return null;    //  Se está vazio, não retorna nada!
        }
        return buffer[top--];   //  Se a seguir está vazio, remove o último elemento adicionado;
    }
    public T escolher()
    {
        if(estaVazio()){
            System.out.println("Buffer vazio! Nada a remover.");
            return null;
        }
        return buffer[top]; //  parecido com o 'pop', mas não remove a posição vazia, a retorna;
    }
   //   Declaração de estaVazio 
    public boolean estaVazio()
    {
        return top == -1;   //  Está vazio => decrementa;
    }
    public boolean estaCheio()
    {
        return top == capacidade - 1;
    }
}