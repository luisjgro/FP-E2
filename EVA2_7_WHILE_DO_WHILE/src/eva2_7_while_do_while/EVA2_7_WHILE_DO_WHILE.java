package eva2_7_while_do_while;

public class EVA2_7_WHILE_DO_WHILE {

    public static void main(String[] args) {
        System.out.println("WHILE");
        int val = 1;
        while (val <= 10){
            System.out.print(val + " - ");
            val++;
        }
        val = 1;
        do{
            System.out.print(val + " - ");
            val++;
        }while(val <= 10);
    }
    
}
