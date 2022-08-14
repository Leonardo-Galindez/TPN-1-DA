import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[]args){
        String frase;
        boolean valor;
        char caract;
        valor=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese frase");
        frase=sc.nextLine();
        System.out.println("Ingrese caracter");
        caract=sc.next().charAt(0);
        valor=VerificarCadena(frase, caract);
        if(valor){
            System.out.println("El caracter se encuentra en la frase");
        }else{
            System.out.println("El caracter no se encuentra en la frase");
        }
    }

    public static boolean VerificarCadena(String cadena, char caracter){
        boolean valorCaracter;
        int i,longitud;
        i=0;
        valorCaracter=false;
        longitud=cadena.length();
        while(valorCaracter==false && i<longitud){
            if(cadena.charAt(i)==caracter){
                valorCaracter=true;
            }
            i++;
        }
        return valorCaracter;
    }
}
