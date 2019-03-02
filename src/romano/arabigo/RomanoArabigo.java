/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romano.arabigo;

import java.util.Scanner;
import static romano.arabigo.funciones.AraRom;
import static romano.arabigo.funciones.RomAra;

/**
 *
 * @author arturo
 */
public class RomanoArabigo {

    /**
     *
     * @param msg
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String texto, morse = " ", msg1, msg2;

        Scanner teclado = new Scanner(System.in);
        String a, Traducido1, entrada;
        int c;
        boolean b = true;
        while (b) {
            System.out.println("=====================================================================================\n                     Traductor Morse-Texto \n ¿Que desea hacer? , seleccione un opcion con el numero que aparece"
                    + " \n \n 1-.Arabigo-->Romano \n 2.-Romano-->Arabigo \n 3.-Salir");
            System.out.println("-->");
            a = teclado.nextLine();
            switch (a) {
                case "1":
                    System.out.println("Ingrese numero normal entero:");
                    c = teclado.nextInt();
                    if (c <= 3000) {
                        AraRom(c);
                    }

                    do {
                        entrada = teclado.nextLine();
                        System.out.println(entrada);
                    } while (!entrada.equals(""));

                    break;
                case "2":
                    System.out.println("Ingrese un numero en romano");
                    msg2 = teclado.nextLine();
                    RomAra(msg2);

                    do {
                        entrada = teclado.nextLine();
                        System.out.println(entrada);
                    } while (!entrada.equals(""));
                    
                    break;
                case "3":
                    b = false;

            }
            System.out.println("   ");
        }

    }

}
