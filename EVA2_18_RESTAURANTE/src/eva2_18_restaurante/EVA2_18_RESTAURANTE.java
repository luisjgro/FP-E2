package eva2_18_restaurante;

import java.util.Scanner;

public class EVA2_18_RESTAURANTE {

    public static void main(String[] args) {
        String menu[] = {"Enchiladas", "Burritos", "Tortas", "Tamales", "Tacos", "Montados"};
        int precios[] = {140, 85, 90, 35, 60, 70};
        Scanner captu = new Scanner(System.in);
        int cantidad, producto;
        for( int i = 0; i < menu.length; i++){
            System.out.println(i + " - " + menu[i] + " $ " + precios[i]);
        }
        
        System.out.println("Cual seria tu orden? (Introduce el numero de tu producto)");
        producto = captu.nextInt();
        captu.nextLine();
        System.out.println("Cuantas ordenes?");
        cantidad = captu.nextInt();
        captu.nextLine();
        System.out.println("El costo es de $ " + cantidad * precios[producto]);
    }
    
}
