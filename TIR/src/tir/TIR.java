/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tir;

/**
 *
 * @author Jose Carlos Palma
 */
public class TIR {
    
    private VAN van;
    
    public TIR(VAN van){
        this.van = van;
    }
    
    
    /**
     * 
     * @return 
     */
    public VAN getVan(){
        return this.van;
    }
    
    /**
     * 
     * @param van 
     */
    public void setVan(VAN van){
        this.van = van;
    }
    
    /**
     * Calcula el error relativo entre:<br>
     * <CODE>
     * | TIR<sub>n+1</sub> + TIR<sub>n</sub> |<br>
     * ------------------<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;| TIR<sub>n+1</sub> |
     * </CODE>
     * @param tir1 es TIR<sub>n+1</sub>
     * @param tir2 es TIR<sub>n</sub>
     * @return 
     */
    public double error(double tir1, double tir2){
        return (tir1 - tir2) / tir1;
    }
    
    public double getTIR(double tasaInicial){
        double tir1 = tasaInicial;
        double tir2 = 0;
        
        do{
            tir2 = tir1;
            
            tir1 = tir2 - van.getVan(tir2) / van.getVanPrima(tir2);
            
        }while(  Util.setPrecision(error(tir1, tir2), 10) != 0.0 );
        
        return tir1;
    }
    
    
}
