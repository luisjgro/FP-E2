package eva2_17_arreglos;

public class EVA2_17_ARREGLOS {

    public static void main(String[] args) {
        String diasSemana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes",
            "Sabado", "Domingo"};
        int valores [] = {20, 50, 100, 200, 500, 1000};
        
        for (int i = 0; i < diasSemana.length; i++){
            System.out.print(diasSemana[i] + " - ");
        }
        System.out.println("");
        for (int i = 0; i < valores.length; i++){
            System.out.print(valores[i] + " - ");
        }
    }
    
}
