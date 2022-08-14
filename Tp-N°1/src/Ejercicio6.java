import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[]args){
        String frase,word;
        int cant;

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese frase");
        frase=sc.nextLine();
        System.out.println("Ingrese frase");
        word=sc.next();
        cant=ContOcurrencias(frase, word);
        System.out.println("La palabra:"+word+"  esta "+cant+" veces en la frase");
    }

    public static int ContOcurrencias(String cadena,String palabra){
        int longitud,j;
        j=0;
        longitud=0;
        longitud=cadena.length();
        for(int i=0;i<longitud;i++){
            if(cadena.indexOf(palabra)!=-1){
                j++;
            }
        }
         return j;

    }
}
