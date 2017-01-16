/**
 * Programación Orientada a Objetos
 */
public abstract class Animal {

    private String Patas,Color,Nombre;
    private int Peso;


    public Animal(String patas, String color, String nombre, int peso) {
        Patas = patas;
        Color = color;
        Nombre = nombre;
        Peso = peso;
    }

    public String getPatas() {
        return Patas;
    }

    public void setPatas(String patas) {
        Patas = patas;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
        Peso = peso;
    }


    public abstract void caminar();
}
