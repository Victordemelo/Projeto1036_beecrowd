/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author victo
 */
import java.util.Scanner;
import java.lang.Math;

public class Projeto1036 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double A, B, C, delta, r1, r2;

        A = leitor.nextDouble();
        B = leitor.nextDouble();
        C = leitor.nextDouble();
        delta = (B*B) - 4 * A * C;
        r1 = (-B + Math.sqrt(delta)) / (2 * A);
        r2 = (-B - Math.sqrt(delta)) / (2 * A);

        if (delta > 0 && A != 0) {
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}
