/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_gerardodiazandjuancarlos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class Lab4P2_GerardoDiazANDJuanCarlos {
    static Scanner lea = new Scanner (System.in);
    static ArrayList<Personaje> personaje = new ArrayList();
    static ArrayList<Villanos> villanos = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personaje p = new Personaje();
        SpidermanPunk SP = new SpidermanPunk();
        SuperiorSpiderman SS = new SuperiorSpiderman();
        ClasicoSpiderman CS = new ClasicoSpiderman();
        Blindado b = new Blindado();
        Alienigena a =  new Alienigena();
        AlteradoGenetico AG =  new AlteradoGenetico();
        
        
        SpidermanPunk punk = new SpidermanPunk("MESSI", 150.0, 1500.0, "ARGENTINA");
        personaje.add(punk);
        
        SuperiorSpiderman superior = new SuperiorSpiderman("PETER", 180.0, 1700.0, "UNO");
        personaje.add(superior);
        
       
        ClasicoSpiderman clasico = new ClasicoSpiderman("MILES", 200.0, 2100.0, "ESPEJO");
        personaje.add(clasico);
        
        SpidermanPunk punk1 = new SpidermanPunk("RONALDO", 201.0, 2500.0, "MADRID");
        personaje.add(punk1);
        
        SuperiorSpiderman superior1 = new SuperiorSpiderman("GWEN", 300.0, 3700.0, "MILKERS");
        personaje.add(superior1);
        
        ClasicoSpiderman clasico1 = new ClasicoSpiderman("PORKY", 500.0, 5000.0, "TOCINO");
        personaje.add(clasico1);
      
        
        
        int opci=0;
        while(opci!=6){
            System.out.println("-------------------------------");
            System.out.println("1) Listar Spidermans");
            System.out.println("2) Listar Enemigos");
            System.out.println("3) Modificar Spidermans");
            System.out.println("4) Modificar Enemigos");
            System.out.println("5) Jugar");
            System.out.println("6) Salir");
            System.out.print("Ingrese una opcion: ");
            opci = lea.nextInt();
            System.out.println("-------------------------------");
            switch(opci){
                case 1:{
                    for (Personaje personaje1 : personaje) {
                        System.out.println(personaje1);
                        
                    }
                
                }
                break;
                case 2:{
                    
                }
                break;
                case 3:{
                    int opc = 0;

                    while (opc != 6) {
                        System.out.println("-------------------------------");
                        System.out.println("1) Modificar Nombre");
                        System.out.println("2) Modificar Puntos de Ataque");
                        System.out.println("3) Modificar Puntos de Vida");
                        System.out.println("4) Modificar Universo");
                        System.out.println("5) Modificar Todo");
                        System.out.println("6) Salir");
                        System.out.print("Ingrese una opcion: ");
                        opc = lea.nextInt();
                        System.out.println("-------------------------------");
                        switch (opc) {
                            case 1: {
                                
                            }
                            break;
                            case 2:{
                                
                            }
                            break;
                            case 3:{
                               
                            }
                            break;
                            case 4:{
                                
                            }
                            break;
                            case 5:{
                                
                            }
                            break;
                        }
                    }
                    
                }
                break;
                case 4:{
                    int opc = 0;

                    while (opc != 6) {
                        System.out.println("-------------------------------");
                        System.out.println("1) Modificar Nombre");
                        System.out.println("2) Modificar Puntos de Ataque");
                        System.out.println("3) Modificar Puntos de Vida");
                        System.out.println("4) Modificar Universo");
                        System.out.println("5) Modificar Todo");
                        System.out.println("6) Salir");
                        System.out.print("Ingrese una opcion: ");
                        opc = lea.nextInt();
                        System.out.println("-------------------------------");
                        switch (opc) {
                            case 1: {
                                
                            }
                            break;
                            case 2:{
                                
                            }
                            break;
                            case 3:{
                               
                            }
                            break;
                            case 4:{
                                
                            }
                            break;
                            case 5:{
                                
                            }
                            break;
                        }
                    }
                    
                }
                break;
                case 5:{
                    
                }
                break;
                        
            }
        }
    }
    
}
