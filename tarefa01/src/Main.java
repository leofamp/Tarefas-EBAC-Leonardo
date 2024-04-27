
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Pilha pilha = new Pilha();
        System.out.println(pilha.isEmpty());
        pilha.push(1);
        System.out.println(pilha);
        System.out.println(pilha.isEmpty());
        pilha.push(9);
        pilha.push(7);
        pilha.push(6);
        pilha.push(3);
        System.out.println(pilha);
        System.out.println(pilha.size());
        System.out.println(pilha.top());
        pilha.pop();
        System.out.println(pilha);

        Fila fila = new Fila();
        System.out.println(fila.isEmpty());
        System.out.println(fila);
        fila.enqueue(1);
        System.out.println(fila);
        System.out.println(fila.isEmpty());
        fila.enqueue(48);
        System.out.println(fila);
        System.out.println(fila.size());
        System.out.println(fila.rear());
        System.out.println(fila.front());
        fila.enqueue(35);
        System.out.println(fila);
        System.out.println(fila.size());
        System.out.println(fila.rear());
        System.out.println(fila.front());
        fila.dequeue();
        System.out.println(fila);
        fila.dequeue();
        System.out.println(fila);
        System.out.println(fila.isEmpty());
        fila.dequeue();
        System.out.println(fila);
        System.out.println(fila.isEmpty());

        ListaEncadeada myList = new ListaEncadeada();

        myList.insert(7,3);
        myList.printList();
        System.out.println(myList.size());
        myList.insert(3,5);
        myList.printList();
        System.out.println(myList.size());
        myList.insert(12,8);
        myList.printList();
        System.out.println(myList.size());
        myList.remove(7);
        myList.printList();
        System.out.println(myList.size());
        System.out.println(myList.elementAt(3));

    }
}