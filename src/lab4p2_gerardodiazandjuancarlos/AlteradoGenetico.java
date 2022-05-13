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
public class AlteradoGenetico extends Villanos{

    public AlteradoGenetico() {
        super();
        
    }

    public AlteradoGenetico(String nombre, double ataque, double vida, String universo) {
        super(nombre, ataque, vida, universo);
    }

    @Override
    public String toString() {
        return "AlteradoGenetico{" + super.toString() + '}';
    }
    
    
    
    
    
}
