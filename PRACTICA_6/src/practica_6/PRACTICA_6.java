package practica_6;

import java.util.Scanner;

public class PRACTICA_6 {

    public static void main(String[] args) {
        int num;
        String cade = "";
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduzca un numero: ");
        num = captu.nextInt();
        captu.nextLine();
        
        for(int i = 1; i<= num; i++){
            cade = cade + "*";
            System.out.println(cade);
        }
        for(int i = num; i>=1; i--){
            cade ="";
            for(int j = 1; j <= i; j++){
                cade = cade + "*";
            }
            System.out.println(cade);
        }
    }
    
}
