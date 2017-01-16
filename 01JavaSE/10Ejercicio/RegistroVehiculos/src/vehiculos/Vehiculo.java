package vehiculos;

import java.util.Scanner;

/**
 * Created by uriel on 13/01/17.
 */
public abstract class Vehiculo  {
    private int id;
    private String color;
    private float peso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }


    public void mostrarInfoGeneral(){
        String info = String.format("\n----------------%s-------------- \nID: %d \nColor: %s \n Peso: %f",
                this.getClass().getCanonicalName(),
                id,
                color,
                peso);
        System.out.println(info);
    }

    public abstract void mostrarInfoEspecifica();

    public void registrarDatosGenerales() {
        System.out.println("Introduce el ID");
        Scanner in = new Scanner(System.in);
        this.id = in.nextInt();
        System.out.println("Introduce el Color");
        in = new Scanner(System.in);
        this.color = in.nextLine();
        System.out.println("Introduce el peso");
        in = new Scanner(System.in);
        this.peso = in.nextFloat();
    }

    public abstract  void registrarDatos();
}
