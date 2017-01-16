package vehiculos;

import java.util.Scanner;

/**
 * Created by uriel on 16/01/17.
 */
public class Trailer extends Vehiculo {
    private int numRemolques;
    private String tipoTrailer;

    public int getNumRemolques() {
        return numRemolques;
    }

    public void setNumRemolques(int numRemolques) {
        this.numRemolques = numRemolques;
    }

    public String getTipoTrailer() {
        return tipoTrailer;
    }

    public void setTipoTrailer(String tipoTrailer) {
        this.tipoTrailer = tipoTrailer;
    }

    @Override
    public void mostrarInfoEspecifica() {
        mostrarInfoGeneral();
        String info = String.format("Número de remolques: %d \nTipo de trailer: %s", numRemolques, tipoTrailer);
        System.out.println(info);
    }

    @Override
    public void registrarDatos() {
        registrarDatosGenerales();

        System.out.println("Introduce el número de remolques");
        Scanner in = new Scanner(System.in);
        this.numRemolques = in.nextInt();

        System.out.println("Introduce el tipo de trailer");
        in = new Scanner(System.in);
        this.tipoTrailer = in.nextLine();
    }
}
