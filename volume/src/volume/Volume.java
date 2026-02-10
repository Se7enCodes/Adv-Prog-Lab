/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package volume;
class Figure{
    double d1, d2, d3;
    Figure(double d1, double d2, double d3){
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        
    }
    final void volume(){
        System.out.println("\nVolume of figure is\n" + (d1 * d2 * d3));
    }
}
/**
 *
 * @author student
 */
public class Volume {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figure F = new Figure(1,9,10);
        F.volume();
    }
    
}
