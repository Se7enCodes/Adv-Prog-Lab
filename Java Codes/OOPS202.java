/* ----- INHERITANCE -----
• What is it? Inheritance is a mechanism where one class (called the Derived class or Subclass) acquires the properties and behaviors (methods) of another class (called the Base class or Superclass).

• The "Is-A" Relationship: You use inheritance when one thing is a specialized version of another. For example, a "ScienceStudent" is a "Student."
    The {extends} Keyword: In Java, you use the word extends to create this connection.

• Accessing Members: 
    The derived class can access and use the variables and methods of the base class as if they were its own.
*/

// Base Class (Parent)
class StudentofCSE {
    String name = "Generic Student";
    String department = "CSE";
    
    void study() {
        System.out.println("This student is studying...");
    }
}

// Derived Class (Child) - ScienceStudent inherits everything from StudentofCSE

class ScienceStudent extends StudentofCSE {
    String laboratory = "Advanced Programming Lab";

    void performExperiment() {

        // Accessing base class member 'name' directly because it is inherited
        System.out.println(name + " of department - " + department + " is performing an experiment in " + laboratory);
    }

    public static void main(String[] args) {
        ScienceStudent ScSt1 = new ScienceStudent();
        
        // Calling method from the Base class
        ScSt1.study(); 
        
        // Calling method from the Derived class
        ScSt1.performExperiment();
    }
}

/*
• Code Reusability: You don't have to rewrite the name variable or the study() method for every different type of student (Art student, Commerce student, etc.). You write it once in the base class and everyone else "inherits" it.

• Organization: 
    It creates a logical hierarchy in your code, making it easier to manage as your program grows.
*/