package practica_4;

import java.util.Scanner;

public class PRACTICA_4 {

    public static void main(String[] args) {
        String cade;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de texto: ");
        cade = captu.nextLine();
        
        for (int i = 0; i < cade.length();i++){
            char caracter = cade.charAt(i);
            if(caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U' ||
               caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                System.out.println(caracter);
            }
        }
    }
    
}
