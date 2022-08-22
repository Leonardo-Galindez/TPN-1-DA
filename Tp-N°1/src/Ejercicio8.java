import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String cadena,incriptada;
        System.out.println("Ingrese cadena");
        cadena=sc.nextLine();
        incriptada=Incriptar(cadena);
        System.out.println(incriptada);
    }
    public static String Incriptar(String cadena){
        int lon;
        char letra,a;
        String frase;
        frase="";
        lon=cadena.length();
        for(int i=0;i<lon;i++){
            letra=cadena.charAt(i);
            switch(letra){
                case 'a':
                    frase=frase+'*';
                break;
                case 'e':
                    frase=frase+'/';
                break;
                case 'i':
                    frase=frase+'+';
                break;
                case 'o':
                    frase=frase+'-';
                break;
                case 'u':
                    frase=frase+'#';
                break;
                default:
                    frase=frase+letra;
                break;
            }
        }
        return frase;
    }
}
