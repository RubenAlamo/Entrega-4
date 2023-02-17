import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<Double> notasCantidad = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cúal es el número de notas que quieres introducir? ");
        int numNotas = teclado.nextInt();

        for (int i = 0; i < numNotas; i++) {
            System.out.println("Introduce la nota " + (i+1));
            double nota = teclado.nextDouble();
            notasCantidad.add(nota);
        }

        double sumaNota = 0;
        for (int i = 0; i < notasCantidad.size(); i++) {
            sumaNota = sumaNota + notasCantidad.get(i);
        }
        double media = sumaNota / notasCantidad.size();
        System.out.println("La media de las notas es: " + media);
    }
}