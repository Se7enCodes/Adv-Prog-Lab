/* ----- ABSTRACT CLASSES -----
• What is an Abstract Class? 
    An abstract class is a class that is declared with the abstract keyword. It is an "incomplete" class—you cannot create an object (instantiate) of an abstract class directly.

• What is an Abstract Method? 
    This is a method that has a declaration (name, return type, parameters) but no body (no code inside {}). It ends with a semicolon.

• The Purpose: 
    It acts as a strict contract. If you inherit from an abstract class, you must provide the implementation (the body) for all its abstract methods.
    
--> Imagine every student must "study," but how they study is so different that we can't write a "general" version in the parent class.
*/


// Abstract Parent Class
abstract class Student {
    String name;

    // A regular method (implemented)
    void attendClass() {
        System.out.println("Student is attending class.");
    }

    // An ABSTRACT method (no body)
    // This forces every child to define their own 'study' method.
    abstract void study(); 
}

// Child Class
class ScienceStudent extends Student {
    // We MUST implement the abstract method here
    void study() {
        System.out.println("Studying through lab experiments and research.");
    }
}

class ArtsStudent extends Student {
    void study()
}

public class Main {
    public static void main(String[] args) {
        // Student s = new Student(); // ERROR: Cannot create object of abstract class
        
        ScienceStudent s1 = new ScienceStudent();
        s1.attendClass(); // Calls the regular method from parent
        s1.study();       // Calls the implemented method in child
    }
}

/*
• Enforcement: It allows a lead programmer to say, "I don't know how you will study, but if you want to be a 'Student' in my system, you must have a study() method."

• Security & Design: It prevents someone from creating a generic "Student" object that doesn't have specific behaviors. You can only create specific types of students (like Science or Art).

Think of it this way: A "Shape" is abstract (you can't draw just a "shape"), but a "Circle" or "Square" is concrete. The "Shape" class would be abstract and force the others to have an area() method.
*/