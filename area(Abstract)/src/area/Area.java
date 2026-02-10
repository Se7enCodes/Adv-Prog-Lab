/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package area;
 abstract class Figure{
    double d1,d2;
    Figure(double d1,double d2){
        this.d1=d1;
        this.d2=d2;
    }
     abstract void areacal();
} 
class Rect extends Figure{
Rect(double d1,double d2){
super(d1,d2);
}
void areacal(){
 System.out.println("area of rectangle="+(d1*d2));
}
}
class Tri extends Figure{
    Tri(double d1,double d2){
        super(d1,d2);
    }
    void areacal(){
        System.out.println("area of triangle="+(d1*d2)/2);
    }
}
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rect R = new Rect(10,4); 
        R.areacal();
       Tri T =new Tri(10,4);
        T.areacal();
      //  Figure F= new Figure(10,4);
      //  F.areacal();
    }
    
}
