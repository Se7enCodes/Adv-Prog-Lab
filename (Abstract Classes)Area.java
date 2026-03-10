/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package area;
class Figure{
    double d1, d2;
    Figure(double d1, double d2){
        this.d1 =d1;
        this.d2 = d2;
    }
    void areacal(){
        System.out.println("Here, area can be calculated");
    }
}
class Rect extends Figure{
    Rect(double d1, double d2){
        super(d1,d2);
    }
    
    void areacal(){
            System.out.println("Area of Rectangle" + (d1*d2));
        }
}
class Tri extends Figure{
    Tri(double d1, double d2){
        super(d1, d2);
    }
    void areacal(){
        System.out.println("Area of triangle" + (0.5 * d1 * d2));
    }
}
    

/**
 *
 * @author student
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rect R = new Rect(10,4);
        R.areacal();
        Tri T = new Tri(2,3);
        T.areacal();
    }
    
}
