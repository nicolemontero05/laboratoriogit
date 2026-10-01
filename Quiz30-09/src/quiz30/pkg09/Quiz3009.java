/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz30.pkg09;

import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class Quiz3009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = JOptionPane.showInputDialog("Solicitar cantidad de empleados: ");
       
        Double salarioIndividual = Double.parseDouble(JOptionPane.showInputDialog("Ingresar salarioIndividual"));
        
        Double SEM = salarioIndividual * 0.0925;
        Double IVM = salarioIndividual * 0.0508;
        
        JOptionPane.showMessageDialog(null,"Estimado " + nombre + "La empresa debera abonar a la CCSS de la siguiente manera: \n\n" + "salarioIndividual: " + String.format("%.2f", salarioIndividual) + "\n" + "SEM: " + String.format("%.2f", SEM) + "\n" + "IVM: " + String.format("%.2f",+  IVM));
        
       
        
        
            
        
        
        
        
        
                
            
        
        
        
        
        
        
    }
    
}
