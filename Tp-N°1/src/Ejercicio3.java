import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int numero,pares,mayor;
        pares=0;
        mayor=0;
        do {
            System.out.println("Ingrese numero");
            numero=sc.nextInt();
            if(mayor<numero){
                mayor=numero;
            }
            if(numero%2==0&&numero>=0){
                pares++;
            }
        } while (numero>=0);
        System.out.println("La cantidad de numeros pares es:"+pares);
        System.out.println("El mayor numero leido fue:"+mayor);
    }
}
