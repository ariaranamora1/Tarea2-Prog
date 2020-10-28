import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Prime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un valor entre 5 y 300: ");
        int x = scan.nextInt();

        boolean prime = false;
        if (x < 5 | x > 300) {
            System.out.println("Valor inválido");
        } else if (x >= 5 | x <= 300) {
            System.out.println("Valor válido");

            int result;
            prime = false;

            for (int i = 2; i <= sqrt(x); ++i) {
                result = x % i;

                if (result == 0) {
                    prime = true;
                    break;
                }
            }
        }
        if (!prime) {
            System.out.println("El valor " + x + " es un número primo");
        } else {
            System.out.println("El valor " + x + " no es un número primo");
        }

    }

}