import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {

        ArrayList<Double> notasCantidad = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las notas que quieras, para terminar introduce -1");
        double nota = teclado.nextDouble();
        while (nota != -1) {
            System.out.println("Introduce la nota ");
            notasCantidad.add(nota);
            nota = teclado.nextDouble();
        }
        double sumaNota = 0;
        for (int i = 0; i < notasCantidad.size(); i++) {
            sumaNota = sumaNota + notasCantidad.get(i);
        }
        double media = sumaNota / notasCantidad.size();
        System.out.println("La media de las notas es: " + media);
    }
}
