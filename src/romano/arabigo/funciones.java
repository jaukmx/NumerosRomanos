/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romano.arabigo;

/* OYE ARTURO!!!!!!!!!!!!!!!!!!
           SI TU ARTURO DEL FUTURO  
           Me costo mucho tiempo reinterpretar mi propio codigo :s
           Asi que por que me quiero yo mismo y quiero evitarme dolores de cabeza en el futuro
           y desveladas sobre todo desbeladas :c por  comentar todo o la mayor parte del codigo despues de escribirlo 
           cuando modifiques o mejores el codigo COMETALO!!!!1!!
           para ver que hace cada cosa CREEMELO >.< Me lo agradeceras.
           
 */
public class funciones {

    public static int AraRom(int numeroAra) {
        int Nume = 0, num1 = numeroAra, i = 0;
        int a[] = {1000, 500, 400, 100, 50, 40, 10, 6, 5, 4, 1};///factores a dividir 
        String r = "", NumR[] = {"M", "D", "CD", "C", "L", "XL    ", "X", "VI", "V", "IV", "I"};//numeros en romano que equivalen en espacio de Vector a los factorea a dividor
        ///Ciclo para empezar desifrar cada factor empezando desde el 1000 y terminando desde el factor 1
        while (numeroAra > 0) {
            Nume = numeroAra / a[i]; ///factores por ejeplo para 1256 seria: 1256/a[0]=1.256 en entero seria 1 
//            System.out.println(Nume);// prints de debug para ver el numero que se quiere convertir a romano
            for (int j = 0; j < Nume; j++) {

                if (Nume >= j) {
                    r = r + NumR[i];
                    //                   System.out.println("if  n " + i);

                }
                //            System.out.println("Ciclo n " + j + " | " + numeroAra); ///Print de debug para ver en que ciclo
                numeroAra = numeroAra - a[i];
                //          System.out.println(r);
            }

            i++;

        }
        System.out.println("\n");
        System.out.println(num1 + " en Romano es: " + r);

        return 0;

    }

    public static void RomAra(String numeroRom) { //IV
        int i = 0, decimal[] = {1000, 500, 100, 50, 10, 5, 1};///factores a dividir 
        int respuesta = 0;
        String r = "", NumR[] = {"M", "D", "C", "L", "X", "V", "I"},
                caracter;///carcteres donde de almacenan el caracter en legtras individuales del numero en romano temporalmente

        while (i < numeroRom.length()) {

            caracter = Character.toString(numeroRom.charAt(i));
            for (int j = 0; j <= 6; j++) {

                if (caracter.equals(NumR[j])) {//// si la primera letra del numero en romano del usuario es igual al una de lr
                    ////
                    if (i + 1 < numeroRom.length()) {  //si hay mas caracteres despues del que se esta en la posición "i" de "numeroRom" 
                        System.out.println("hOAL AAA"); ///PRINTLN de depuración

                        if (caracter.equals('C')) {                      //Se compara si es c entonces
                            System.out.println("El if de C, e i =" + i); ///PRINTLN de depuración

                            if (numeroRom.charAt(i + 1) == 'D') {        // Si el siguinte caracter es "D" 
                                respuesta += 400;                        //entonces se asume que es "CD" osea 400.
                                i++;                                     // entonces di es "CD" Se salta una letra para segir con el otro numerp
                                System.out.println("El if de 400. " + respuesta);
                            } else {                                      //si no 
                                respuesta += 100;                         //En tonces solo es "C" osea 100.
                                System.out.println("El if de 100");       // imprecion de depuración
                            }

                        }

                        if (caracter.equals("X")) {               //entonces si no fue "C" se ve si es "X".
                            if (numeroRom.charAt(i + 1) == 'L') {        //si despues de La "X" hay una "L"
                                respuesta += 40;                         //entonces es XL osea 40
                                i++;                                     //por ser un numero de dos letras de tiene que saltar un letra en el numero romano  
                                System.out.println("XL es 40");
                            } else {                                     //Si no entonces
                                respuesta += 10;                         //el numero es "X" que es 10.
                            }

                        }
                        if (caracter.equals("I")) {                     //SI no fue "X" entonces se ve si es "I"
                            if (numeroRom.charAt(i + 1) == 'V') {       //si despues de La "i" hay una "L"
                                respuesta += 4;                         //entonces es XL osea 5
                                i++;                                     //por ser un numero de dos letras de tiene que saltar un letra en el numero romano  

                            } else {                                     //Si no entonces
                                respuesta += 1;                         // solo es V o 5

                            }
                            
                        }
                    } 
                    if(i + 1 < numeroRom.length() || numeroRom.length()==1){
                        
                        respuesta += decimal[j]; //si ninguna de todas las ecepciones aplica Se asigna las letras individiales en Romano.
                    }

                }

            }
            i++;
        }

        System.out.println(numeroRom + " es en arabigo: " + respuesta);

    }
}
