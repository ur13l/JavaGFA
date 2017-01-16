/**
 * Created by uriel on 10/01/17.
 */

import matematicas.Matematicas;
import java.util.Scanner;
import java.io.OutputStreamWriter.

public class Main {

    public static void main(String[] args){
        int a;
        int b;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número");
        a = s.nextInt();
        System.out.println("Introduce otro número");
        b = s.nextInt();

        Matematicas m = new Matematicas();
        float r = m.suma(a,b);
        System.out.println("El resultado es: " + r);

    }
}
