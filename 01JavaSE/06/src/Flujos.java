/**
 * Flujo de datos y Control
 */
public class Flujos {

    public static void main(String[] args) {

        flujoIf(3,5);
        flujoSwitch(4);
        cicloFor(10);
        cicloWhile(5);
        cicloDoWhile(5);

    }


    public static void flujoIf(int a, int b){

        System.out.println("-- IF --\n");

        if(a > b){
            System.out.println("A es mayor que B");
        }else{
            System.out.println("B es mayor que A");
        }
    }

    public static void flujoSwitch(int a){
        System.out.println("\n-- IF --\n");


        switch (a){
            case 1:
                System.out.println("A es igual a Uno");
            break;
            case 2:
                System.out.println("A es igual a Dos");
                break;
            case 3:
                System.out.println("A es igual a Tres");
                break;
            case 4:
                System.out.println("A es igual a Cuatro");
                break;
            case 5:
                System.out.println("A es igual a Cinco");
                break;
                default:
                    System.out.println("A es diferente a 1,2,3,4 y 5");
                    break;
        }

    }

    public static void cicloWhile(int cantidad){
        System.out.println("\n-- WHILE --\n");

        int a = 0;
        while (a < cantidad){
            System.out.println(a);
            a++;
        }
    }

    public  static void cicloFor(int cantidad){
        System.out.println("\n-- FOR --\n");

        for(int a = 0; a < cantidad; a++){
            System.out.println(a);
        }
    }


    public static void cicloDoWhile(int cantidad){
        System.out.println("\n-- DO WHILE --\n");

        int a = 0;
        do{
            System.out.println(a);
            a++;
        }while (a < cantidad);
    }

}
