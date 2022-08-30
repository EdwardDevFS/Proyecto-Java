/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edward.edward;
import javax.swing.*;
import java.util.*;
public class TRABAJO_FINAL {
    
    private String Cliente;
    private String DNI;
    private String Pass;
    private String sig;
    //private final double n_DNI = Double.parseDouble(DNI);
    private static final double  Saldo_Inicial = 0;
    private double Saldo_Total = 0; 
    ArrayList BD = new <String> ArrayList();
    ArrayList Datos = new ArrayList();
    
    //double[] Op = {n_DNI,Saldo_Total};
    
    void INGRESE_DATOS(){
        //Empezamos pidiendole registrar su nombre, dni y contraseña 
        //NOMBRE
        Scanner N_Client = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        if(N_Client.equals("")){
            System.out.println("Ingrese su nombre");
        }else{
            Cliente = N_Client.nextLine();       
        }   
        //DNI
        Scanner DNI_Client = new Scanner (System.in);
        System.out.println("Ingrese su dni");
        DNI = DNI_Client.next();    
        if(DNI_Client.equals("")){
             System.out.println("Ingrese su dni");
        }
        else{
            while(DNI.length()>8){
                System.out.println("Hey, este número no tiene 8 dígitos");
                System.out.println("Ingrese su dni");
                DNI = DNI_Client.next();
            }
        }
        //CONTRASEÑA
           Scanner password = new Scanner(System.in); 
           System.out.println("Ingrese una contraseña: ");
           Pass = password.nextLine();

           //GUARDAR EN EL ARREGLO

           String[] array1 = {Cliente,DNI,Pass};
           //System.out.println(Arrays.toString(array1));
           Datos.add(array1);
           

    }
    
    void Depositar(){
        Scanner Mas_Dinero = new Scanner(System.in);
        System.out.println("Cuanto dinero desea depositar");
        double Dinero = Mas_Dinero.nextDouble();
        if(Dinero <= 0){
            JOptionPane.showMessageDialog(null, "El mínimo para depositar es S/1.00 Sol");
        }else{
            Saldo_Total = Saldo_Inicial + Dinero;
            JOptionPane.showMessageDialog(null, "Usted ha depositado: S/"+Dinero+" Soles");
            Datos.add(Saldo_Total);
        }  
    }
    void Consultar(){
        if (Saldo_Total == 0){
            JOptionPane.showMessageDialog(null, "Su saldo es: S/0 Nuevos soles.");
        }else
        {
            JOptionPane.showMessageDialog(null, "Su saldo es: S/"+Saldo_Total+" Soles");
        }
    }
    void retirar(){
        Scanner Menos_Dinero = new Scanner(System.in);
        System.out.println("Cuanto dinero desea retirar");
        double menos_dinero = Menos_Dinero.nextDouble();
        if(Saldo_Total < menos_dinero){
            JOptionPane.showMessageDialog(null,"Saldo insuficiente");
        }else{
            Saldo_Total -= menos_dinero;
            JOptionPane.showMessageDialog(null,"Se ha retirado S/"+menos_dinero+" De su cuenta bancaria");
            Datos.add(Saldo_Total);
        }   
    }

}
