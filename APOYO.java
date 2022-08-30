/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edward.edward;

/**
 *
 * @author hp
 */

import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.*;
import java.util.*;
public class APOYO {
    
    
    
    public static void main(String[] args) throws InterruptedException   {
        TRABAJO_FINAL e = new TRABAJO_FINAL();
        EDTB a = new EDTB();
        a.setVisible(true);

        int bandera = 0;
        try{
            do{
                do {
                    try{
                        System.out.println("BIENVENIDO A NEW PERU BANK");
                        System.out.println("********SERVICIOS********");
                        System.out.println("1  :  AGREGAR USUARIOS   ");
                        System.out.println("2  :  DEPOSITAR DINERO   ");
                        System.out.println("3  :  RETIRAR DINERO     ");
                        System.out.println("4  :  CONSULTAR SALDO    ");
                        System.out.println("5  :  SALIR DE LA APP    ");
                        Scanner sc = new Scanner(System.in);
                        System.out.println("\n¿Qué desea hacer?");
                        int inicia = sc.nextInt();
                        
                        if (inicia == 0 && inicia >= 6){
                            JOptionPane.showMessageDialog(null, "Elija una de las opciones asignadas.","Operación inválida",1);
                            String correct = sc.nextLine();
                        }
                        switch (inicia) {
                            case 1 -> {
                                JOptionPane.showMessageDialog(null, "En proceso");



                            }
                            case 2 -> {
                                e.Depositar();
                            }
                            case 3 -> e.retirar();
                            case 4 -> {
                                e.Consultar();
                            }
                            case 5 -> {
                                bandera = 2;        //EL BUCLE NO ME TERMINABA.
                                break;              //POR LO QUE UTILICE ESTAS 2 FORMAS
                            }
                            case 6 ->{
                                System.out.println(e.Datos); //EN ESTE ARRAYLIST, TUVE UNAS DUDAS
                                e.BD.add(e.Datos);           //ESTARE BUSCANDO INFORMACIÓN PARA IMPRIMIR 
                                System.out.println(e.BD);    //TOTO UN ARRAYLIST EN LA CONSOLA
                            }//ERROR:   AL IMPRIMIR EN LA CONSOLA DARÁ Ljava.lang.String;@dbd940d.
                            default ->{
                                JOptionPane.showMessageDialog(null, "Elija una de las opciones asignadas.","Operación inválida",2);
                            }
                        } 
                    }finally{        
                        
                        System.out.println("\nVolviendo al menu...\n\n");
                        Thread.sleep(100,100);
                    }
                } while (bandera == 0);
            } while (bandera != 2);
        }finally{
                    Salida();
                }
    
    }
        
    
     void Error(){
        JOptionPane.showMessageDialog(null, "Credenciales equivocadas, intentelo de nuevo.","Operación inválida",3);
    }
     static void Salida() throws InterruptedException {
        System.out.println("Saliendo, por favor espere...");
        for (int i = 0; i < 5; i++) {
            System.out.println(".");
            Thread.sleep(1000,100);
        }
        System.exit(0);
        }
     }




    
    



