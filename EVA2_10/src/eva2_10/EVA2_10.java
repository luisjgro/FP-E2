package eva2_10;

import java.util.Scanner;

public class EVA2_10 {

    public static void main(String[] args) {
        int ds;
        Scanner captu = new Scanner(System.in);
        do{
            System.out.println("Introduce el dia de la semana");
            ds = captu.nextInt();
            captu.nextLine();
        }while(ds<1||ds>7);
        
        switch(ds){
            case 1: System.out.println("DOMINGO");
            break;
            case 2: System.out.println("LUNES");
            break;
            case 3: System.out.println("MARTES");
            break;
            case 4: System.out.println("MIERCOLES");
            break;
            case 5: System.out.println("JUEVES");
            break;
            case 6: System.out.println("VIERNES");
            break;
            case 7: System.out.println("SABADO");
            break;
            default:
        }
    }
    
}
