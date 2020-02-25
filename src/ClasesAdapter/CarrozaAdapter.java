/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAdapter;

import Clases.Carroza;
import adapter.Vehiculo;


public class CarrozaAdapter extends Vehiculo {

    public Carroza carroza = new Carroza();

   

    @Override
    public void Acelerar() {
        System.out.println("Acelerar carroza");
        this.carroza.MoverRiendas();
        this.carroza.arrearCaballos();
    }

    @Override
    public void Frenar() {
        System.out.println("Frenar carroza ");
        this.carroza.HalarRiendas();
    }

}
