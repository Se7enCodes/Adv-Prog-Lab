/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectarea;
/**
 *
 * @author student
 */
public class RectArea {

    /**
     * @param args the command line arguments
     */
    double l;
    double b;
    
    RectArea(double l, double b)
    {
        this.l = l;
        this.b = b;
    }
    RectArea(double a)
    {
        l = b = a;
    }
    
    void area()
    {
        System.out.println("Volume = " + (l * b));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        RectArea obj1 = new RectArea(5, 10);
        obj1.area();
        
        RectArea obj2 = new RectArea(12);
        obj2.area();
    }
    
}
