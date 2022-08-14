import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num,cifras,rest;
        do{
        System.out.println("Ingrese numero 3 cifras");
        num=sc.nextInt();
        cifras=VerificarCifras(num);
        }while(cifras!=3); 
        for (int i=0; i<cifras;i++){
            rest=num%10;
            num=num/10;
            System.out.print(rest);   
        }
    }
    //modulo para verificar que en numero ingresado sea de 3 cifras
    public static int VerificarCifras(int numero){
        boolean valorCifra;
        int cifra;
        cifra=0;
        valorCifra=false;
        while(!valorCifra){
            numero=numero/10;
            if(numero==0){
             valorCifra=true;
            }
            cifra++;
        }
        return cifra;
    }

}
