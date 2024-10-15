package eva2_9_acceso_while;

import java.util.Scanner;

public class EVA2_9_ACCESO_WHILE {

    public static void main(String[] args) {
        String user = "";
        int psw = 0;
        Scanner captu = new Scanner(System.in);
        
        while (!user.equals("admin") || psw != 1234){
            System.out.println("Ingrese su usuario: ");
        user = captu.nextLine();
        System.out.println("Ingrese su contraseña: ");
        psw = captu.nextInt();
        captu.nextLine();
        if (psw != 1234 || !user.equals ("admin")){
            System.out.println("Informacion incorrecta, vuelva a intentar");
        }   
        }
        System.out.println("Informacion correcta, bienvenido/a");
    }
    
}
