/**
 * Created by uriel on 14/01/17.
 */
public class Main {

    public static void main(String[] args) {
        OperacionArreglo pares = arr -> {
            int countPares = 0;
            for(int i = 0 ; i < arr.length; i++){
                if((arr[0]%2) == 0)
                    countPares += 1;
            }
            int [] newArray = new int[countPares];
            int count = 0;
            for(int i = 0 ; i < newArray.length ; i++){
                if((arr[0]%2) == 0) {
                    newArray[count] = arr[i];
                    count++;
                }
            }
            return newArray;
        };

        OperacionArreglo impares = arr -> {
            int countPares = 0;
            for(int i = 0 ; i < arr.length; i++){
                if((arr[0]%2) != 0)
                    countPares += 1;
            }
            int [] newArray = new int[countPares];
            int count = 0;
            for(int i = 0 ; i < newArray.length ; i++){
                if((arr[0]%2) == 0) {
                    newArray[count] = arr[i];
                    count++;
                }
            }
            return newArray;
        };

        int[] arr = {2,5,2,42,3,12,4,2,3};

        System.out.println("Pares: ");
        int[] par = op(arr, pares);
        for(int i = 0 ; i < par.length; i++){
            System.out.println(par[i] + " ");
        }

        System.out.println("Impares: ");
        int[] impar = op(arr, impares);
        for(int i = 0 ; i < impar.length; i++){
            System.out.println(impar[i] + " ");
        }





    }

    public static int[] op(int[] arr, OperacionArreglo operacion){
        return operacion.operacion(arr);

    }
}
