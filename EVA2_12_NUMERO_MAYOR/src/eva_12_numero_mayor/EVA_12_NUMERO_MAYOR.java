package eva_12_numero_mayor;

import java.util.Scanner;

public class EVA_12_NUMERO_MAYOR {

    public static void main(String[] args) {
        int num = 0, mem = 0, mem2 = 0;
        Scanner captu = new Scanner(System.in);
        do{
        if (mem > num){
            mem2 = mem;
        }else{
            mem = num;
        }
        System.out.println("Ingrese un numero");
        num = captu.nextInt();
        captu.nextLine();
        }while(num != -1);
        System.out.println("EL numero mayor fue: " + mem2);
    }
}
