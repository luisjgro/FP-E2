package practica_1;

import java.util.Scanner;

public class PRACTICA_1 {

    public static void main(String[] args) {
        String cadena;
        int num;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingrese un texto: ");
        cadena = captu.nextLine();
        System.out.println("Ingrese el numero de repeticiones: ");
        num = captu.nextInt();
        captu.nextLine();
         for (int i = 1; i <= num; i++ ){
             System.out.println(cadena);
         }
    }
    
}
