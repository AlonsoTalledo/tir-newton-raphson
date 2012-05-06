/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tir;

/**
 *
 * @author Jose Carlos Palma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VAN van = new VAN(7);
        van.setInversion(18000.0);
        van.setFlujos(3000.0, 3000.0, 2000.0, 4000.0, 4000.0, 4000.0, 7000.0);
        
        TIR tir = new TIR(van);
        
        System.out.println(tir.getTIR(0.38));
        
    }
}
