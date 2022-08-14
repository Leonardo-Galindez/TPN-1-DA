
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[]args){
        String frase,palabra,bin;
        int mayor,j,cantPala,ocurr,i;
        i=0;
        cantPala=1;
        ocurr=0;
        bin="";
        j=0;
        mayor=0;
        boolean valor;
        valor=false;
        palabra="";

        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese frase");
        frase=sc.nextLine();
        int longitud;
        longitud=frase.length();
        cantPala=CantOcurrencias(frase);

        while(i<longitud && ocurr<longitud){
            if(frase.charAt(ocurr)==' '){
                palabra=subCadena(frase, ocurr+j-ocurr,ocurr-1 );
                System.out.println(palabra);
                j=palabra.length();
                if(mayor<j){
                   mayor=j;
                }
                ocurr=j+2;
            }
            ocurr++;
            i++;
        }

           
        




       
    }
     /*System.out.println(palabra);
        j=palabra.length();
        palabra="";
        /*for (int i = j+1; i < longitud; i++) {
            palabra = palabra + frase.charAt(i);
        }     
        System.out.println(palabra);*/

    //modulo para contar la cantidada de palabras de la frase
    public static int CantOcurrencias(String cadena){
        int palabras,longitud;
        palabras=1;
        longitud=cadena.length();
        for(int i=0; i<longitud;i++){
            if(cadena.charAt(i)==' '){
                palabras++;
            } 
        }
        return palabras;
    }

    public static String subCadena(String b, int pos1, int pos2) {
        // 3: Módulo para obtener una subcadena
        // b es la cadena de caracteres que ingresa el usuario
        // pos1 es la primera posicion 
        // pos2 es la segunda posicion
        // retorna la subcadena que va de pos1 hasta pos2 inclusive
        int i, cant;
        String bin;
        bin = "";
        cant = b.length();
        if (pos1 >= 0 && pos1 < cant && pos2 >= 0 && pos2 < cant && pos1<=pos2) {
            // Validación para que las posiciones no sean menores a 0 ni mayores a cantidad de caracteres
            // pos1 siempre tiene que ser menor que pos2
            for (i = pos1; i <= pos2; i++) {
                bin = bin + b.charAt(i);
            }
        } else {
            bin = "ERROR.";
        }
        return bin;
    }
     
}
