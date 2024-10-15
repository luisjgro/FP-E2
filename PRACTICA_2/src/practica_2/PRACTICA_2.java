package practica_2;

import java.util.Scanner;

public class PRACTICA_2 {

    public static void main(String[] args) {
        int n1,n2,n3,n4;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Digite un numero: ");
        n1 = captu.nextInt();
        n3 = n1;
        captu.nextLine();
        System.out.println("Digite otro numero: ");
        n2 = captu.nextInt();
        n4 = n2;
        captu.nextLine();
        
        System.out.println("acendente: ");
        for (int i = n1; i <= n2; i++){
            System.out.println(i);
            
        }
        System.out.println("decendente: ");
        for (int i = n4; i >= n3; i--){
            System.out.println(i);
        }
    }
    
}
