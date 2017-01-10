package com.flechaamarilla.primeraplus.venta;

public class Venta {
private String Nombre;
private String Fecha;
private String Origen;
private String Destino;
private String Unidad;

    public Venta(String nombre, String fecha, String origen, String destino, String unidad) {
        Nombre = nombre;
        Fecha = fecha;
        Origen = origen;
        Destino = destino;
        Unidad = unidad;

        System.out.println("Compra realizada a nombre de " + nombre + "\ndesde " + origen + " con destino a " + destino + ".\nFecha: " + fecha + "\nUnidad: " + unidad);
    }

}
