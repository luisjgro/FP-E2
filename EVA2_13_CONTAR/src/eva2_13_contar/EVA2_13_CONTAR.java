package eva2_13_contar;

import java.util.Scanner;

public class EVA2_13_CONTAR {

    public static void main(String[] args) {
        String cade;
        int bocales = 0;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de texto");
        cade = captu.nextLine();
        
        for(int i = 0; i < cade.length(); i++){
            if (cade.charAt(i) == 'a' || cade.charAt(i) == 'e' || cade.charAt(i) == 'i' ||
                    cade.charAt(i) == 'o' || cade.charAt(i) == 'u' ){
                bocales++;
            }
        }
        System.out.println("Su palabra tiene " + bocales + " bocales");
    }    
}
