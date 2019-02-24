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
        int i= 0, decimal[] = {1000, 500, 100, 50, 10, 5, 1};///factores a dividir 
        int respuesta = 0,error3=0,error1,sum=0;
        int[] acumulador3 ={0,0,0,0};
        boolean V = true,error;
        
       String r = ""     ;     
///carcteres donde de almacenan el caracter en legtras individuales del numero en romano temporalmente
            char rep3[] = {'I', 'X', 'C', 'M'},caracter, NumR[] = {'M', 'D', 'C', 'L', 'X', 'V', 'I'},
                     NoRep[] = {'V', 'L', 'D',' '},a;
            char[] caracteres=numeroRom.toCharArray();
        
       ///////Analizames si No se super  los carates de maximo 3 apariciones
        for(i=0;i<numeroRom.length();i++){
            for(int ii=0;ii<=3;ii++){
                if(caracteres[i]==rep3[ii]){
                   acumulador3[ii]=acumulador3[ii]+1;
                }
                if (acumulador3[ii]>3){
                    V=false;
                    System.out.println("El numero "+rep3[ii]+" se repite mas de 3 veces");
                }
        }
        
            
        //System.out.println(numeroRom + " es en arabigo: " + respuesta);

        }
    }
}


