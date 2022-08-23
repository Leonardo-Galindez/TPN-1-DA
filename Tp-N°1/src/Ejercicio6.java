import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String frase,palabra;
        int cont;
        System.out.println("Ingrese la frase ");
        frase = sc.nextLine();
        System.out.println("Ingrese la palabra a buscar ");
        palabra =sc.nextLine();
        cont=ContarPalabra(frase,palabra);
        System.out.println("Se repitio la palabra \""+palabra+"\" : "+cont+" veces");
    }

    public static int ContarPalabra(String cadena, String word){
        String nombre;
        int cont,i,lon;
        char caracter;
        cont =0;
        nombre="";
        lon=cadena.length();
        for(i=0;i<lon;i++){
            caracter=cadena.charAt(i);
            if(i==lon-1){
                nombre= nombre+caracter;
                if((nombre).equals(word)){
                    cont++;
                }
            }else{
                if(caracter==' '){
                    if((nombre).equals(word)){
                        cont++;
                        nombre="";
                    }else{
                        nombre="";
                    }
                }else{
                  nombre= nombre+caracter;
                }
            }
           
            
        }  
        return cont;
        
    }
}
