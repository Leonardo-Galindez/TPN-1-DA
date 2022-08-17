import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String frase,palabra,nombre;
        int cont,i,lon;
        char caracter,car;
        
        cont =0;
        nombre="";
        System.out.println("Ingrese la frase ");
        frase = sc.nextLine();
        System.out.println("Ingrese la palabra a buscar ");
        palabra =sc.nextLine();
        
        lon=frase.length();
        for(i=0;i<lon;i++){
            caracter=frase.charAt(i);
            if(caracter==' '){
                nombre="";
            }else{
            nombre= nombre+caracter;
            }
            if((nombre).equals(palabra)){
                cont++;
            }
        }
        System.out.println("Se repitio la palabra \""+palabra+"\" : "+cont+" veces");
    }
}
