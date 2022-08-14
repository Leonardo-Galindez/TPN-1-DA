import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int longitud;
        String frase,palabra;
        palabra="";
        System.out.println("Ingrese la frase");
        frase = sc.nextLine();
        palabra=WordBig(frase);
        longitud=frase.length();
        System.out.println("La palabra mas larga es :"+palabra);
    }
    
    //modulo para 
    public static String WordBig(String cadena){
        String nombre,palabra;
        int i,longitud,mayor;
        char caracter;
        palabra ="";
        mayor=0;
        nombre="";
        longitud=cadena.length();
        for(i=0;i<longitud;i++){
            caracter=cadena.charAt(i);
            if(caracter==' '){
                nombre="";
            }else{
                nombre= nombre+caracter;
            }
            if(nombre.length()>mayor){
                mayor=nombre.length();
                palabra=nombre;
            }
        }
        return palabra;
    }
}
