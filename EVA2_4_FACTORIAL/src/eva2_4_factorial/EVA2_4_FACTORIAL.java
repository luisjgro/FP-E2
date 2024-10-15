package eva2_4_factorial;

import java.util.Scanner;

public class EVA2_4_FACTORIAL {

    public static void main(String[] args) {
        int valor;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingrese el numero al cual desea sacarle factorial: ");
        valor = captu.nextInt();
        captu.nextLine();
        int fact = 1;
        for (int i = valor; i >= 1; i--){
            fact = fact * i;
        }
        System.out.println("El factorial de " + valor + " es igual a: " + fact);
    }
    
}
