import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[]args){
        String frase;
        int cantLetras,cantWord;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese frase");
        frase=sc.nextLine();
        cantLetras=SepararPalabra(frase);
        System.out.println(cantLetras);
        cantWord=CantOcurrencias(frase);
        System.out.println(cantWord);
        for(int i=0;i<cantWord;i++){
            
        }

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

    //modulo para separar la palabras de la frase
    public static int SepararPalabra(String cadena){
        int i,longitud;
        boolean valor;
        i=0;
        valor=false;
        longitud=cadena.length();
        while(valor=false || i<longitud){
            if(cadena.charAt(i)!=' '){
                valor=true;
            }
            i++;
        }
        return i;
    }
}
