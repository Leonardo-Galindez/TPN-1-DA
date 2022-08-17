import javax.swing.SpringLayout;

public class App {
    public static void main(String[] args) throws Exception {
        int i=0, n=5,suma=0,suma2;
        for(i=1;i<=n;i++){
            suma2=0;
            for(int j=1;j<=i;j++){
                suma2=suma2+j;

            }
            suma=suma+suma2;
            
        }
        System.out.println(suma);
    }
}
