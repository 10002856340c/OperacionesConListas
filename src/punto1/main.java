
package punto1;

import java.util.Scanner;



public class main {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario los valores inicial y final de la lista
        System.out.print("Introduzca el valor inicial de la lista: ");
        int valorInicial = sc.nextInt();
        System.out.print("Introduzca el valor final de la lista: ");
        int valorFinal = sc.nextInt();

        // Creamos la lista enlazada con los múltiplos de 5 entre los valores inicial y final
        NodoMultiplo cabeza = new NodoMultiplo();
        cabeza.valor = (int) Math.ceil(valorInicial / 5.0) * 5; // Redondeamos hacia arriba el valor inicial al múltiplo de 5 más cercano
        while (cabeza.valor <= valorFinal) {
            cabeza.siguiente = new NodoMultiplo();
            cabeza = cabeza.siguiente;
            cabeza.valor = cabeza.anterior.valor + 5;
        }

        // Recorremos la lista e imprimimos los múltiplos de 5
        NodoMultiplo actual = cabeza.anterior; // Empezamos por el último nodo para imprimir los valores en orden
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.anterior;
        }
    }
}

