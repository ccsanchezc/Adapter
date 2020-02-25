/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import adapter.Vehiculo;

public class Carro extends Vehiculo {

    public Carro() {
        System.out.println("Carro...");
    }

    @Override
    public void Acelerar() {
        System.out.println("Acelerar carro");
    }

    @Override
    public void Frenar() {
        System.out.println("Frenar carro");
    }

}
