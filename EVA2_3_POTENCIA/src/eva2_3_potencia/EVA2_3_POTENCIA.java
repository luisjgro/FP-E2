package eva2_3_potencia;

import java.util.Scanner;

public class EVA2_3_POTENCIA {

    public static void main(String[] args) {
        int base, expo;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce la base: ");
        base = captu.nextInt();
        captu.nextLine();
        System.out.println("Introduce el exponente");
        expo = captu.nextInt();
        captu.nextLine();
        int acum = 1;
        for (int i = 1; i <= expo; i++){
            acum = acum * base;
        }
        System.out.println("Potencia = " + acum);
    }
    
}
