
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[]args){
        String frase,palabra,bin;
        int mayor,j,cantPala,i;
        cantPala=1;
        i=0;
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

        for(int cant=1;cant<=cantPala;cant++){
            while(frase.charAt(i)!=' '&& i<longitud-1){
                palabra=palabra+frase.charAt(i);
                i++;
            }
            j=palabra.length();
            if(mayor<j){
                mayor=j;
            }
            i=mayor+1;
            palabra="";
        }
    
        
        /*System.out.println(palabra);
        j=palabra.length();
        palabra="";
        /*for (int i = j+1; i < longitud; i++) {
            palabra = palabra + frase.charAt(i);
        }     
        System.out.println(palabra);*/
    }

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
     
}
