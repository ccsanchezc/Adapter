/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import Clases.Carro;
import ClasesAdapter.CarrozaAdapter;
import ClasesAdapter.TricicloAdapter;
import ClasesAdapter.TroncoMovilAdapter;
import java.util.Scanner;

public class principal {

    /**
     * @param args the command line arguments
     */
    private static Vehiculo vehiculo;

    public static void main(String[] args) {

        switch (menu()) {
            case 1: {
                vehiculo = new Carro();
                inicioVehiculo();
                break;
            }
            case 2: {
                vehiculo = new TroncoMovilAdapter();
                inicioVehiculo();
                break;
            }
            case 3: {
                vehiculo = new CarrozaAdapter();
                inicioVehiculo();
                break;
            }
            case 4: {
                vehiculo = new TricicloAdapter();
                inicioVehiculo();
                break;
            }
            case 5: {
                break;
            }
            default: {
                System.out.println("Numero no encontrado");
            }

        }
    }

    private static int menu() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nMENÚ DE OPCIONES");
        System.out.print("\n1. Carro.");
        System.out.print("\n2. TroncoMovil.");
        System.out.print("\n3. Carroza.");
        System.out.print("\n4. Triciclo.");
        System.out.print("\n5. Salir del programa.");
        System.out.print("\nSeleccione opción: ");

        return Integer.parseInt(input.nextLine());
    }

    public static void inicioVehiculo() {
        vehiculo.Acelerar();
        vehiculo.Frenar();
    }

}
