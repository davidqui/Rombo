/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rombo;

import com.sun.xml.internal.bind.util.Which;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author David Antonio Quijano Ramos
 */
public final class Rombo {

    public static void main(String[] args) {

        int diametro = 0;

        do {
            try {
                System.out.print(" Ingrese un numero : ");
                Scanner scanner = new Scanner(System.in);

                diametro = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Debe ingresar un \"Numero\"");
               
            }
        } while (diametro < 2);

        for (int j = 0; j < diametro; j++) {

            for (int i = 0; i < diametro - j - 1; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < j + 1; ++i) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }

        for (int j = diametro - 2; j >= 0; --j) {
            for (int i = 0; i < diametro - j - 1; ++i) {
                System.out.print(" ");
            }
            for (int i = 0; i < j + 1; ++i) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }

    }

}
