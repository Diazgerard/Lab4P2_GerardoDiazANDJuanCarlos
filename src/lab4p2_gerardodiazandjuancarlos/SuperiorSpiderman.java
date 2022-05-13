/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_gerardodiazandjuancarlos;

import java.util.Random;

/**
 *
 * @author gerar
 */
public  class SuperiorSpiderman extends Personaje {

    public SuperiorSpiderman() {
        super();
    }

    public SuperiorSpiderman(String nombre, double ataque, double vida, String universo) {
        super(nombre, ataque, vida, universo);
    }

    @Override
    public String toString() {
        return "SuperiorSpiderman{" + super.toString() + '}';
    }

    public double batalla(Personaje villano) {
        Random random = new Random();
        int value = random.nextInt(30+10)+ 10;
        double porcentaje = value/100 +1; 
        return super.getAtaque() * porcentaje;
    }

}
