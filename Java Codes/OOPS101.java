// ----- CLASSES & OBJECTS -----
class Pen {
    String color;
    // color is a property of pen, also known as an attribute or field

    String type;
    double tipSize;
    int MRP;

    void write() {
        System.out.println("The pen is writing.");
    }

    void tellColor() {
        System.out.println("The color of the pen is: " + color);
    }
    // write is a *method* of pen, or a function of it
}

public class OOPS101 {
    public static void main(String[] args) { // main method takes string arguments.
        Pen pen1 = new Pen();
        // pen1 is an object of class Pen. It is an instance of the class 

        pen1.color = "blue";
        // color is a data member of pen1

        pen1.tipSize = 0.7;

        pen1.tellColor();
        // calling method

        pen1.write();
    }
}

/*
• Organization: Instead of having random variables for student1Name, student2Name, student1Roll, etc., you group them all under one logical unit: the Student class.

• Reusability: Once you write the Student class, you can create 1,000 student objects without rewriting the display() logic or variable definitions.
*/