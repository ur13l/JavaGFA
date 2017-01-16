package vehiculos;

import java.util.Scanner;

/**
 * Created by uriel on 16/01/17.
 */
public class Helicoptero extends Vehiculo {
    private int numHelices;
    private String tipoVuelo;

    public int getNumHelices() {
        return numHelices;
    }

    public void setNumHelices(int numHelices) {
        this.numHelices = numHelices;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }
    @Override
    public void mostrarInfoEspecifica() {
        mostrarInfoGeneral();
        String info = String.format("Número hélices: %d \nTipoVuelo: %s", numHelices, tipoVuelo);
        System.out.println(info);
    }

    @Override
    public void registrarDatos() {
        registrarDatosGenerales();

        System.out.println("Introduce el número de hélices");
        Scanner in = new Scanner(System.in);
        this.numHelices = in.nextInt();

        System.out.println("Introduce el tipo de vuelo");
        in = new Scanner(System.in);
        this.tipoVuelo = in.nextLine();
    }

}
