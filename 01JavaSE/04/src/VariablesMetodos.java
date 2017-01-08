
/*
*
*  Variables y Metodos
*
*  modificador Static ->
*  Solo existe una instancia en memoria; en ese caso la variable es única para todas las instancias
*  (objetos) de la clase (ocupa un único lugar en memoria).
*  Por lo tanto no se instancia para poder utilizarlo.
*
*  modificador de Acceso Public -> Acceso publico desde cualquier lugar (Clase, Paquete, etc.)
*
*
*
* */

public class VariablesMetodos {

    static int total = 0;


    public static void main(String[] args) {
        primerMetodo();
    }


     public static void primerMetodo(){

        total = numero1() + numero2();
        System.out.println(total);

    }

    public static int numero1(){
        return 9;
    }

    public static int numero2(){
        return 10;
    }

}
