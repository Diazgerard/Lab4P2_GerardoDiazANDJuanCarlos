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
public abstract class Villanos {

    private String nombre;
    private double ataque;
    private double vida;
    private String universo;

    public Villanos() {
    }

    public Villanos(String nombre, double ataque, double vida, String universo) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        this.universo = universo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    @Override
    public String toString() {
        return "villanos{" + "nombre=" + nombre + ", ataque=" + ataque + ", vida=" + vida + ", universo=" + universo + '}';
    }
   public abstract double batalla();
}
