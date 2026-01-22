package box;

public class Box 
{
    double l, b, d;

    // Constructor with 3 parameters
    Box(double l, double b, double d)
    {
        this.l = l;
        this.b = b;
        this.d = d;
    }

    // Constructor for cube
    Box(double a)
    {
        l = b = d = a;
    }

    void volume()
    {
        System.out.println("Volume = " + (l * b * d));
    }

    // MAIN METHOD (must be inside the class)
    public static void main(String[] args)
    {   
        Box obj1 = new Box(5, 10, 2);
        obj1.volume();
    }
}