/* ----- RUNTIME POLYMORPHISM -----
• Method Overriding: 
    This happens when a subclass (child) provides a specific implementation for a method that is already defined in its superclass (parent).

• Runtime Polymorphism: 
    "Polymorphism" means "many forms." In Java, this allows a single action (like a method call) to behave differently depending on the object that is performing it. The decision of which method to run is made at runtime, not when the code is compiled.

• Upcasting: 
    This is when you use a Parent-class reference to point to a Child-class object (e.g., Student s = new ScienceStudent();). This is the key to seeing polymorphism in action.
*/

// Parent Class
class Student {
    void performTask() {
        System.out.println("The student is performing a general task.");
    }
}

// Child Class 1
class ScienceStudent extends Student {

    // Overriding the parent's method to be more specific
    @Override 
    void performTask() {
        System.out.println("The Science student is conducting a lab experiment.");
    }
}

// Child Class 2
class ArtStudent extends Student {
    @Override 
    void performTask() {
        System.out.println("The Art student is sketching a portrait.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Upcasting: Parent reference pointing to Child objects
        // This is the crucial step that TRIGGERS polymorphism

        Student s1 = new ScienceStudent();
    //  Parent           Child
        Student s2 = new ArtStudent();

        // Runtime Polymorphism: 
        // Even though both calls look the same (s1.performTask), 
        // Java executes the specific version based on the actual object.

        s1.performTask(); // Output: ...conducting a lab experiment.
        s2.performTask(); // Output: ...sketching a portrait.
    }
}

/*
• Flexibility: 
    You can write a single piece of code that handles any kind of "Student" without needing to know the specific type beforehand.

• Extensibility: If you add a new MusicStudent later, you only need to override performTask() and your existing logic will work with it automatically.
*/