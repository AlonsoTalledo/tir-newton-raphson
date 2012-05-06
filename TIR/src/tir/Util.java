/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tir;

import java.text.DecimalFormat;

/**
 *
 * @author Jose Carlos Palma
 */
public final class Util {
    
    private Util(){}
    
    public static double setPrecision(double valor, int precision){
        
        DecimalFormat df = new DecimalFormat("#.00000");
        
        
        return Double.parseDouble(df.format(valor));
        
    }
}
