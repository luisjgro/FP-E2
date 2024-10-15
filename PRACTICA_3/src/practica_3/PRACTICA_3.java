package practica_3;

import java.util.Scanner;

public class PRACTICA_3 {

    public static void main(String[] args) {
        String cadena;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de texto: ");
        cadena = captu.nextLine();
        
        for(int i = 0; i < cadena.length(); i++){
            System.out.println(cadena.charAt(i));
        }
    }
    
}
