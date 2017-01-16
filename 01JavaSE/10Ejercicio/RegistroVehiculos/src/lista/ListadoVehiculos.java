package lista;

import vehiculos.Vehiculo;

/**
 * Created by uriel on 13/01/17.
 */
public class ListadoVehiculos {
    private Vehiculo[] vehiculos;

    public ListadoVehiculos(){
        vehiculos = new Vehiculo[10];
    }

    public boolean add(Vehiculo v){
        for (int i = 0 ; i < vehiculos.length; i++){
            if(vehiculos[i] == null){
                vehiculos[i] = v;
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(int id){
        boolean eliminado = false;
        for(int i = 0 ; i < vehiculos.length ; i++){
            if(eliminado){
                vehiculos[i-1] = vehiculos[i];
            }
            if(vehiculos[i] != null && vehiculos[i].getId() == id){
                vehiculos[i] = null;
                eliminado = true;
            }
        }
        return eliminado;
    }

    public Vehiculo buscar(int id){
        for (int i = 0 ; i < vehiculos.length; i++){
            if(vehiculos[i].getId() == id){
                return vehiculos[i];
            }
        }
        return null;
    }

    public void mostrarTodo(){
        String info = null;
        System.out.println("----------------------Lista de vehículos--------------------------");
        for (int i = 0 ; i < vehiculos.length; i++){
            if(vehiculos[i] != null)
                vehiculos[i].mostrarInfoEspecifica();
        }
    }

}
