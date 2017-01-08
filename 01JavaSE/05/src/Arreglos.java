/**
 * Arreglos
 */
public class Arreglos {

    public static void main(String[] args) {

        //Arreglo inicializado con valores por defecto
        // Numericos su valor es 0
        // Para cadenas y letras su valor es Vacio
        // Para booleanos su valor es false
        int[] arregloNumerico = new int[3];
        String[] arregloCadena = new String[10];
        boolean[] arregloBoleano = new boolean[4];

        System.out.println(arregloNumerico[2]);
        System.out.println(arregloCadena[9]);
        System.out.println(arregloBoleano[3]);

        int[] arregloInicializadoPropio = {2,4,5,10};

        System.out.println(arregloInicializadoPropio[3]);


        //Arreglos bidimensionales

        int[][] arregloBidimensional = new int[2][3];
        System.out.println(arregloBidimensional[1][2]);


        //Arreglos bidimensionales con valores definidos
        int[][] arrBiDefinido = {{2,3,4},{10,0,4}};
        System.out.println(arrBiDefinido[1][2]);


    }

}
