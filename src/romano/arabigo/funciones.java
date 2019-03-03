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
        int a[] = {1000, 500, 400, 100, 50, 40, 10, 8, 6, 5, 4, 1};///factores a dividir 
        String r = "", acum3 = "", NumR[] = {"M", "D", "CD", "C", "L", "XL", "X", "IIX", "VI", "V", "IV", "I"};//numeros en romano que equivalen en espacio de Vector a los factorea a dividor
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
        int decimal[] = {1000, 500, 100, 50, 10, 5, 1};///factores a dividir 
        int respuesta = 0, sum = 0, Decimales1[] = {1000, 500, 100, 50, 10, 5}, Decimales2[] = {500, 100, 50, 10, 5, 1}, rep3D[] = {1000, 100, 10, 1}, NoRepD[] = {500, 50, 5, 0};

        int[] acumulador3 = {0, 0, 0, 0}, acumulador2 = {0, 0, 0, 0};
        boolean V = true, error;
        String Temporal;
///carcteres donde de almacenan el caracter en legtras individuales del numero en romano temporalmente
        char rep3[] = {'M', 'C', 'X', 'I'},
                NoRep[] = {'V', 'L', 'D', ' '};
        char[] caracteres = numeroRom.toCharArray();

        ///////Analizames si No se super  los carates de maximo 3 apariciones
        for (int i = 0; i < numeroRom.length(); i++) {  /////ciclo para revisar caracter por caracter de array 
            for (int ii = 0; ii <= 3; ii++) {       ///ciclo para revisar si que letra y cuantas veces se repitio
                if (i + 1 < numeroRom.length()) {
                    if (caracteres[i] == rep3[ii] && caracteres[i + 1] == rep3[ii]) {            //si caractres[] en i es igual rep[] en iientonces
                        acumulador3[ii] = acumulador3[ii] + 1;   //se guarda si se detecta la misma letra.
                    }
                }
                if (acumulador3[ii] > 3) {
                    V = false;
                    System.out.println("El numero " + rep3[ii] + " se repite mas de 3 veces");
                }
                if (caracteres[i] == NoRep[ii]) {            //si caractres[] en i es igual NoRep[] en iientonces
                    acumulador2[ii] = acumulador2[ii] + 1;   //se guarda si se detecta la misma letra.
                }
                if (acumulador2[ii] > 1) {
                    V = false;
                    System.out.println("El numero " + NoRep[ii] + " se repite mas de 1 vez");
                }
            }
        }
        ///////Milesrep3[] = {'M', 'C', 'X', 'I'},
        //  NoRep[] = {'V', 'L', 'D', ' '},
        //NumR[] = {'M', 'D', 'C', 'L', 'X', 'V', 'I'},

        ///numeroRom.length()
        if (V) { //saltar se lo de arriva es falso

            
            char NumR[] = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};          ///Numeros en roman0
            char[] arrayRom = numeroRom.toCharArray();               //El vector arrayRom es donde se sacan los caracteres de 
            //son los numeros  en decimal
            int MiNumero[] = {0, 0, 0, 0, 0, 0, 0, 0};                  //El vector MiNumero es donde se guardara los valores de los numeros
            int Respuesta = 0;

            for (int i = 0; i < numeroRom.length(); i++) {   //////METODO que convierte los el string en vector en numeros decimales
                for (int j = 0; j <= 6; j++) {

                    if (arrayRom[i] == NumR[j]) {

                        MiNumero[i] = decimal[j];
                     }
                }

                System.out.println("\n" + MiNumero[i]);
            }

            int ant = 0;
            // 500,100,1,1,10
            for (int i = 0; i <= numeroRom.length(); i++) {

                if ((i + 1) < numeroRom.length() && MiNumero[i] > MiNumero[i + 1]) { ///IF 1, si i es 0, i+1=1 es menor que el largo
                    //vector "XV" tieme mas que es MiNumero[0]=10 > MiNumero[1]=5 entonces   
                    Respuesta += MiNumero[i + 1] + MiNumero[i];                         //Respuesta es igual 10 + 5 = 15.
                    i++;                                                                //Se salta i que a 1.
                    System.out.println("\n En if 1 " + Respuesta + "Ciclo " + i);
   //#################### else IF para verios numeros I , II , II
                } else if ((i + 1) < numeroRom.length() && MiNumero[i] == MiNumero[i + 1]) {     //Si i es 0, i+1=1 es menor que el largovector "IIIX"
                    //  y tieme mas que es MiNumero[0]=1 = MiNumero[1]=1 entonces 
                    ant = MiNumero[i] + MiNumero[i];
                   // System.out.println("ant=" + ant);
                    i++;
                    if ((i + 1) <= numeroRom.length() && MiNumero[i] == MiNumero[i + 1]) {  ///SI i es 1, i+1=2 es menor que el largovector "IIIX"
                        //
                        ant += MiNumero[i];
                        //System.out.println("ant=" + ant);
                        i++;
                        ///////////////////////////////////////////////////////////////////////////      
                    }
                    
                    Respuesta = Respuesta - ant;

                    System.out.println("\n En if 2 " + Respuesta + " Ciclo " + i);
  //####################### IF de comprobacion de Si el numero actual es menor que el sigiente por ejemplo IX##################################
                } else if ((i + 1) <= numeroRom.length() && MiNumero[i] < MiNumero[i + 1]) {
                    Respuesta = Respuesta - MiNumero[i] + MiNumero[i + 1];
                    i++;
                    System.out.println("\n En if 3 " + Respuesta + " Ciclo " + i);

                } else if (i <= numeroRom.length()) {
                    Respuesta += MiNumero[i];
                    i++;
                    System.out.println("\n En if 4 " + Respuesta + " Ciclo " + i);
                }
            }

            System.out.println(numeroRom+"en decimal es: " + Respuesta);

            //////////////////////////////////////////////////////////////
        }
       

    }
}
