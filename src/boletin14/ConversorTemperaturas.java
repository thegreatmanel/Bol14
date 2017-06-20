/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class ConversorTemperaturas {
     
     static int tempmax=80;
     public static void centigradosAFharenheit(double temp){
          double fha=9.0/5.0 * temp + 32.4;
     JOptionPane.showMessageDialog(null, "Son "+fha+" grados Fharenheit");}
         
     public static void centigradosAReamur(double temp){
     double re=4.0 / 5.0 * temp;
     JOptionPane.showMessageDialog(null, "Son "+re+" grados Reamur");
     }
     
    public static void main(String[] args) throws TemperaturaErradaExcepcion {
        int temp= Integer.parseInt(JOptionPane.showInputDialog("Temperatura actual?"));
      if(temp<tempmax){ ConversorTemperaturas.centigradosAFharenheit(temp);
       ConversorTemperaturas.centigradosAReamur(temp);}
      else{throw new TemperaturaErradaExcepcion();}
      
    }
    
}
