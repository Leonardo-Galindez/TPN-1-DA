

public class App {

public static void main(String[] args) {
        String cad, mayor;
        
        System.out.println("Ingrese una frase para conocer su palabra mas larga.");
        cad = TecladoIn.readLine();
        
        mayor = palabraMasLarga(cad);
        
        System.out.println("La palabra mas larga es: "+mayor);
    }
    
    public static String palabraMasLarga(String cad) {
        
        String palabra, masLarga;
        int i;
        
        masLarga = "";
        i = 0;
        palabra = "";
        
        for (i = 0; i < cad.length(); i++) {
            
            if (!Character.isLetter(cad.charAt(i))) {
                palabra = "";
            }
            
            if (Character.isLetter(cad.charAt(i))) {
                
                palabra += cad.charAt(i);
                
            }
            
            if (palabra.length() > masLarga.length()) {
                
                masLarga = palabra;
                
            }
        }
        
        return masLarga;
        
    }

}
