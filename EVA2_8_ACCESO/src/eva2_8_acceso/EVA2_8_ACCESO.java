package eva2_8_acceso;

import java.util.Scanner;

public class EVA2_8_ACCESO {

    public static void main(String[] args) {
        int contra;
        String usu;
        Scanner captu = new Scanner(System.in);
        do{
        System.out.println("Ingrese su usuario: ");
        usu = captu.nextLine();
        System.out.println("Ingrese su contraseña: ");
        contra = captu.nextInt();
        captu.nextLine();
        if (contra != 1234 || !usu.equals ("admin")){
            System.out.println("Informacion incorrecta, vuelva a intentar");
        }
        }while(contra != 1234 || !usu.equals ("admin"));
        System.out.println("Usuario y contraseña correcta, bienvenido/a");
    }
    
}
