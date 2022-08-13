import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner out= new Scanner(System.in);

        int num,mult,i;
        System.out.println("Ingrese numero");
        num=out.nextInt();
        for (i=1;i<=10;i++){
            mult=num*i;
            System.out.println(mult);
        }
    }
}
