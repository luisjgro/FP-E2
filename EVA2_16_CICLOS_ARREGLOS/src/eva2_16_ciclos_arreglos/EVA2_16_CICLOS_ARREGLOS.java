package eva2_16_ciclos_arreglos;

public class EVA2_16_CICLOS_ARREGLOS {

    public static void main(String[] args) {
        int [] datos, x, y, z;
        int val1, val2, arreglo[], val3;
        arreglo = new int [10];
        
        for (int i = 0; i < 10; i++){
            arreglo [i] = (int)(Math.random() * 100);
        }
        
        for (int i = 0; i <10; i++){
            System.out.println(arreglo [i]);
        }
        
    }
    
}
