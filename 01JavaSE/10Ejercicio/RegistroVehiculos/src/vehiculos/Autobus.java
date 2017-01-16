package vehiculos;

import java.util.Scanner;

/**
 * Created by uriel on 16/01/17.
 */
public class Autobus extends Vehiculo{

    private int numPasajeros;
    private String linea;

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    @Override
    public void mostrarInfoEspecifica() {
        mostrarInfoGeneral();
        String info = String.format("Numero Pasajeros: %d \nLinea: %s", numPasajeros, linea);
        System.out.println(info);
    }

    @Override
    public void registrarDatos() {
        registrarDatosGenerales();
        System.out.println("Introduce la cantidad de pasajeros");
        Scanner in = new Scanner(System.in);
        this.numPasajeros = in.nextInt();

        System.out.println("Introduce la línea");
        in = new Scanner(System.in);
        this.linea = in.nextLine();
    }
}
