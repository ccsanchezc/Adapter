/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAdapter;

import Clases.TroncoMovil;
import adapter.Vehiculo;


public class TroncoMovilAdapter extends Vehiculo {

    public TroncoMovil troncoMovil = new TroncoMovil();


    @Override
    public void Acelerar() {
        System.out.println("Acelerar TroncoMovil ");
        this.troncoMovil.BajarPies();
        this.troncoMovil.Correr();
    }

    @Override
    public void Frenar() {
        System.out.println("Frenar TroncoMovil ");
        this.troncoMovil.BajarPies();
        this.troncoMovil.RozarPies();
    }

}
