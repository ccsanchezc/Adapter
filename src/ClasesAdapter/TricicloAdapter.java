/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAdapter;

import Clases.Triciclo;
import adapter.Vehiculo;


public class TricicloAdapter extends Vehiculo {

    public Triciclo triciclo = new Triciclo();

 
    @Override
    public void Acelerar() {
        System.out.println("Acelerar Triciclo ");
        this.triciclo.Pedaliar();
    }

    @Override
    public void Frenar() {
        System.out.println("Frenar Triciclo ");
        this.triciclo.BajarPies();
        this.triciclo.RozarPies();
    }

}
