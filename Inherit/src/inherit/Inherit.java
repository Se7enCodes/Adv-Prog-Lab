/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inherit;

/**
 *
 * @author student
 */
public class Inherit {
    private int i;
    int j;  //no modifier, default
    protected int k;
    Inherit(int m, int n)
    {
        i = m;
        j = n;
    }
    
    void showij()
    {
        System.out.println("i and j = " + i + "&" + j);
    }
    
    static class B extends Inherit
    {
        int k;
        B(int i, int j, int k)
        {
            super(i, j);
            this.k = k;
        }
        void show()
        {
            super.showij();
            System.out.println("k = " + k);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Inherit objA = new Inherit(72,2);
        objA.showij();
        
        B objB = new B(5, 12, 13);
        objB.show();
    }
    
}
