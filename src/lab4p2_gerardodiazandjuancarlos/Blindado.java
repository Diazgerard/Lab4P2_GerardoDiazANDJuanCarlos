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
public  class Blindado extends Personaje {

    public Blindado() {
        super();
    }

    public Blindado(String nombre, double ataque, double vida, String universo) {
        super(nombre, ataque, vida, universo);
    }

    @Override
    public String toString() {
        return "Blindado{" + super.toString() + '}';
    }

    public double batalla(Personaje personaje) {
        if (personaje instanceof ClasicoSpiderman){
             return super.getAtaque() * 1.1;
        }
        else{
            return super.getAtaque();
        }
        
    }

  
}
