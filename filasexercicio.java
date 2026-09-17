import java.util.ArrayDeque;
import java.util.Queue;

public class filas {
    public static void main(String[] args) {
        // fila FIFO: o primeiro que entra e o primeiro que sai.
        Queue<String> filaBanco = new ArrayDeque<>();

        filaBanco.offer("Ana");
        filaBanco.offer("Bruno");
        filaBanco.offer("Carla");

        String pessoaAtendida = filaBanco.poll();
        System.out.println("Saiu da fila do banco: " + pessoaAtendida);
        System.out.println("Fila restante: " + filaBanco);

        // pilha LIFO: o ultimo que entra e o primeiro que sai.
        ArrayDeque<Integer> pilha = new ArrayDeque<>();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        Integer numeroRemovido = pilha.pop();
        System.out.println("Saiu da pilha: " + numeroRemovido);
        System.out.println("Pilha restante: " + pilha);
    }
}
