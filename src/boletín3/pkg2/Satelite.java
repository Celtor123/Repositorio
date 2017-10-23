/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín3.pkg2;

/**
 *
 * @author oracle
 */
public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;
    
    public Satelite () {
    meridiano=paralelo=distanciaTerra=0;
}
    public Satelite(double m,double p,double d) {
    meridiano=m;
    paralelo=p;
    distanciaTerra=d;
}
    
}
