package eva2_11;

import java.util.Scanner;

public class EVA2_11 {

    public static void main(String[] args) {
        int ds;
        Scanner captu = new Scanner(System.in);
        while(true){
            System.out.println("Introduce el dia de la semana");
            ds = captu.nextInt();
            captu.nextLine();
            if(ds>=1 && ds<=7){
                break;
            }
        }
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
