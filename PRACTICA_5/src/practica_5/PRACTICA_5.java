package practica_5;

import java.util.Scanner;

public class PRACTICA_5 {

    public static void main(String[] args) {
        int numero;
        String cade = "";
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingrese un digito: ");
        numero = captu.nextInt();
        captu.nextLine();
        
        for (int i= 1; i <= numero; i++){
            cade = cade + "*";
            System.out.println(cade);
        }
    }
    
}
