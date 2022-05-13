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
        
        Blindado blindado = new Blindado("Rinho",200.0,2500.0,"Universo 980");
        villanos.add(blindado);
        Alienigena alinigena = new Alienigena("Paul",150.0,1000.0,"Desconocido");
        villanos.add(alinigena);
        AlteradoGenetico alte = new AlteradoGenetico("Singe",500.0,2304.0,"Universo 245");
        villanos.add(alte);
        Blindado blindado2 = new Blindado("Rinhoversion2.0", 200.0, 2500.0, "Universo 920");
        villanos.add(blindado2);
        Alienigena alinigena2 = new Alienigena("Venom", 150.0, 1000.0, "Desconocido");
        villanos.add(alinigena2);
        AlteradoGenetico alte1 = new AlteradoGenetico("Carnage", 500.0, 2304.0, "Universo 300");
        villanos.add(alte1);

             int opci = 0;
        while (opci != 6) {
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
            switch (opci) {
                case 1: {
                    for (Personaje personaje1 : personaje) {
                        System.out.println(personaje1);

                    }

                }
                break;
                case 2: {
                    for (Villanos villa : villanos) {
                        System.out.println(villa);

                    }
                }
                break;
                case 3: {
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
                                System.out.println("Ingrese posicion");
                                int opcion = lea.nextInt();
                                System.out.println("Ingrese el nuevo nombre");
                                String n = lea.next();
                                personaje.remove(opcion);
                                personaje.set(opcion, new SpidermanPunk(n, 150.0, 1500.0, "ARGENTINA"));
                                SP.setNombre(n);

                            }
                            break;
                            case 2: {
                                System.out.println("Ingrese la posicion");
                                int opcion = lea.nextInt();
                                System.out.println("Ingrese el nuevo punto de ataque");
                                double x = lea.nextDouble();
                                personaje.remove(opcion);
                                personaje.set(opcion, new SpidermanPunk("MESSI", x, 1500.0, "ARGENTINA"));
                            }
                            break;
                            case 3: {
                                System.out.println("Ingrese la posicion");
                                int opcion = lea.nextInt();
                                System.out.println("Ingrese el nueva vida del personaje");
                                double x = lea.nextDouble();
                                personaje.remove(opcion);
                                personaje.set(opcion, new SpidermanPunk("MESSI", 150.0, x, "ARGENTINA"));
                            }
                            break;
                            case 4: {
                                System.out.println("Ingrese la posicion");
                                int opcion = lea.nextInt();
                                System.out.println("Ingrese el nueva universo del personaje");
                                String x = lea.next();
                                personaje.remove(opcion);
                                personaje.set(opcion, new SpidermanPunk("MESSI", 150.0, 150.0, x));
                            }
                            break;
                            case 5: {
                                System.out.println("Ingrese la posicion");
                                int opcion = lea.nextInt();
                                System.out.println("Ingrese el nuevo nombre");
                                String n = lea.next();
                                System.out.println("Ingrese el nuevo punto de ataque");
                                double x = lea.nextDouble();
                                System.out.println("Ingrese el nueva vida del personaje");
                                double x1 = lea.nextDouble();
                                System.out.println("Ingrese el nueva universo del personaje");
                                String x2 = lea.next();
                                personaje.remove(opcion);
                                personaje.set(opcion, new SpidermanPunk(n, x, x1, x2));
                                
                            }
                            break;
                        }
                    }

                }
                break;
                case 4: {
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
                                System.out.println("Ingrese la posicion que desea");
                                int psi = lea.nextInt();
                                System.out.println("Ingrese el nuevo nombre");
                                String nombre = lea.next();
                                villanos.remove(psi);
                                villanos.set(psi, new Blindado(nombre,200.0,2500.0,"Universo 980"));
                            }
                            break;
                            case 2: {
                                System.out.println("Ingrese la posicion que desea");
                                int pos = lea.nextInt();
                                System.out.println("Ingrese el nuevo puntos de ataque");
                                double xd = lea.nextDouble();
                                villanos.remove(pos);
                                villanos.set(pos, new Blindado("Rihno",xd,2500.0,"Universo 980" ));
                                
                            }
                            break;
                            case 3: {

                            }
                            break;
                            case 4: {

                            }
                            break;
                            case 5: {

                            }
                            break;
                        }
                    }

                }
                break;
                case 5: {

                }
                break;

            }
        }
    }

}
