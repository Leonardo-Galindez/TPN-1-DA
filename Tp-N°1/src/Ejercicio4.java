
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[]args){
        String frase,palabra;
        int mayor,j;
        j=1;
        mayor=0;
        boolean valor;
        valor=false;
        palabra="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese frase");
        frase=sc.nextLine();
        int longitud;
        longitud=frase.length();
      
        for(int i=0;i<longitud;i++ ){
            if(frase.charAt(i)==' '){
                if(mayor<i){
                    mayor=i+1;
                }
                System.out.println(mayor);
                while(){

                }
                j++;
            }
           
            
        }   
        System.out.println(j);
    }

    //modulo para separar la palabras de la frase
  /*  public static int SepararPalabra(String cadena,int i){
        int longitud;
        boolean valor;
        valor=false;
        longitud=cadena.length();
        
        
    }*/
}
