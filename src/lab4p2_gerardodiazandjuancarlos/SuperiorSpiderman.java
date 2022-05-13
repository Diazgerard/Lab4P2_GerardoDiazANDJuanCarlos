/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_gerardodiazandjuancarlos;

/**
 *
 * @author gerar
 */
public class SuperiorSpiderman extends Personaje {

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

    public double batalla() {
        return super.getAtaque();
    }

}
