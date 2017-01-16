package vehiculos;

import java.util.Scanner;

/**
 * Created by uriel on 13/01/17.
 */
public class Motocicleta extends Vehiculo {
    private float medidaManubrio;
    private String transmision;


    @Override
    public void mostrarInfoEspecifica() {
        mostrarInfoGeneral();
        String info = String.format("Medida Manubrio: %f \nTransmision: %s", medidaManubrio, transmision);
        System.out.println(info);
    }

    @Override
    public void registrarDatos() {
        registrarDatosGenerales();

        System.out.println("Introduce la medida del manubrio");
        Scanner in = new Scanner(System.in);
        this.medidaManubrio = in.nextFloat();

        System.out.println("Introduce la transmision");
        in = new Scanner(System.in);
        this.transmision = in.nextLine();
    }

    public float getMedidaManubrio() {
        return medidaManubrio;
    }

    public void setMedidaManubrio(float medidaManubrio) {
        this.medidaManubrio = medidaManubrio;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
}
