/**
 * Tipos de Datos, Operadores y Variables
 */
public class tiposDatosOperadores {

    public static void main(String[] args) {



        boolean bandera = false;
        char caracter = '\u0061'; // <- Si se ponen las dobles comillas Java lo identificara como String
        byte b = 127;
        short s = 32767;
        int entero = 299932;
        long l = 1933992339393933982L;
        float f = 2.93f;
        double d = 39.939393939393;
        String cadena = "Esta es una cadena de texto";


        System.out.println("\nTipos de Dato\n");
        System.out.println(bandera);
        System.out.println(caracter);
        System.out.println(b);
        System.out.println(s);
        System.out.println(entero);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(cadena);

        System.out.println("\nTipos de Datos de objeto\n");

        //TIPOS DE DATOS DE OBJETO
        System.out.println(String.valueOf(d));

        System.out.println("\nOperadores aritmeticos\n");

        //OPERADORES ARITMETICOS

        System.out.println(2 + 3);
        System.out.println(2 * 3);
        System.out.println(2 - 3);
        System.out.println(2f / 3f);

        System.out.println("\nOperadores Relacionales\n");

        //OPERADORES RELACIONALES
        int primero = 5;
        int segundo = 10;

        System.out.println(primero == segundo); //IGUAL A
        System.out.println(primero < segundo); // MENOR A
        System.out.println(primero > segundo); //MAYOR A
        System.out.println(primero >= segundo); //MAYOR O IGUAL A
        System.out.println(primero <= segundo); //MENOR O IGUAL A
        System.out.println(primero != segundo); // DIFERENTE A

        System.out.println("\nOperadores Logicos\n");

        //OPERADORES LOGICOS
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1 && b2); //  AND. El resultado es verdadero si los dos operandos son verdaderos.
        //El resultado es falso en caso contrario. Si el primer operando es falso no se evalúa el segundo,
        // ya que el resultado será falso.


        System.out.println(b1 || b2); // OR. El resultado es falso si los dos operandos son falsos.
        //Si uno es verdadero el resultado es verdadero. Si el primer operando es verdadero no se evalúa el segundo.



    }


}
