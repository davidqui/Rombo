/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rombo;

/**
 *
 * @author David Antonio Quijano Ramos
 */
public class EjemploRombo {

    public static String crearLinea(int numEsp, int estre) {
        String cadena = "";

        for (int i = 0; i < estre; i++){
            cadena = "*" + cadena;
        }
        for (int i = 0; i < numEsp; i++) {
            cadena = " " + cadena;
        }
        return cadena;
    }

    public static void mostrarTriangulo() {
        int numEspa = 4;
        for (int i = 1; i < 9; i += 2) {
            System.out.println(crearLinea(numEspa, i));
            numEspa--;
        }
        int numElem = 9;
        for (int i = 0; i <= 4; i++) {
            System.out.println(crearLinea(i, numElem));
            numElem -= 2;
        }
    }

    public static void main(String[] args) {
        mostrarTriangulo();
    }
}
