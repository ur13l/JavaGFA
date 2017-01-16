import lista.ListadoVehiculos;
import vehiculos.*;

import java.util.Scanner;

/**
 * Created by uriel on 13/01/17.
 */
public class Main {



    public static void main(String[] args) {
        ListadoVehiculos lista = new ListadoVehiculos();
        int opcion;
        do {
            System.out.println(
                    "\n------------------------------------------------------------------------\n" +
                    "Elije una opción: \n1)Registrar vehículo \n2)Buscar Vehículo\n3)Eliminar vehículo(id)\n4)Mostrar todo\n5)Salir\n" +
                            "------------------------------------------------------------------------"
            );
            Scanner in = new Scanner(System.in);
            opcion = in.nextInt();
            switch (opcion) {
                //Registrar
                case 1:
                    registrar(lista);
                    break;
                case 2:
                    buscar(lista);
                    break;
                case 3:
                    eliminar(lista);
                    break;
                case 4:
                    lista.mostrarTodo();
                default:
                    break;

            }
        } while (opcion != 5);
    }

    private static void eliminar(ListadoVehiculos lista) {
        System.out.println("Introduzca el ID a eliminar: ");
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        lista.eliminar(id);
    }

    private static void buscar (ListadoVehiculos lista){
        System.out.println("Introduzca el ID a buscar: ");
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        Vehiculo v = lista.buscar(id);
        v.mostrarInfoEspecifica();
    }

    private static void registrar(ListadoVehiculos lista){
        System.out.println("\n---------------------------------\nElije el tipo de vehículo\n1)Motocicleta\n2)Autobus\n3)Trailer\n4)Helicóptero------------------------------");
        Scanner in = new Scanner(System.in);
        int tipo = in.nextInt();
        Vehiculo v = null;
        switch (tipo){
            case 1:
                v = new Motocicleta();
                break;
            case 2:
                v = new Autobus();
                break;
            case 3:
                v = new Trailer();
                break;
            case 4:
                v = new Helicoptero();
                break;
            default:
                break;
        }
        v.registrarDatos();
        lista.add(v);

    }
}
