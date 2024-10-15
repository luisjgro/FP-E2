package eva2_2_promedio;

import java.util.Scanner;

public class EVA2_2_PROMEDIO {

    public static void main(String[] args) {
        int califa, acum;
        Scanner captu = new Scanner(System.in);
        acum = 0;
        
        for (int i = 1; i <= 10; i++){
            System.out.println("Estudiante #" + i);
            System.out.println("Introduce la calificacion: ");
            califa = captu.nextInt();
            captu.nextLine();
            acum = acum + califa;
        }
        System.out.println("acumulacion  " + acum);
        System.out.println("El promedio es de: " + (acum/10.0));
    }
    
}
