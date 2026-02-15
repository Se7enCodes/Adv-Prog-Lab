/* ----- The *** SUPER(man?) *** Keyword -----
• What is it? 
    While the this keyword refers to the current object, the super keyword is a reference variable used to refer to the immediate parent class object.

• Two Main Purposes:
    1. To Call Parent Constructors: 
        It is used to invoke the constructor of the parent class from the child class's constructor.

    2. To Access Parent Methods: 
        It is used to call a method from the parent class, especially if the child class has overridden that method (see OOPS203).
*/

// Parent Class
class Student {
    String branch;

    // Parent Constructor
    Student(String branch) {
        this.branch = branch;
    }

    void showDetails() {
        System.out.println("Branch: " + branch);
    }
}

// Child Class
class ScienceStudent extends Student {
    String subject = "Physics";

    ScienceStudent() {
        // 1. Using super to call the Parent Constructor [1]
        // This MUST be the first line in the child constructor

        super("Science"); 
        // This calls the Student constructor and initializes the 'branch' variable, sets branch to Science for all ScienceStudent objects.
    }

    @Override
    void showDetails() {
        // 2. Using super to call the Parent's version of the method [1]
        super.showDetails(); 

        System.out.println("Specialization: " + subject);
        // The subject is already initialized to "Physics" in the child class, so we can just print it here.
    }

    public static void main(String[] args) {
        ScienceStudent s1 = new ScienceStudent();
        s1.showDetails();
    }

    // The output will show:
        // Branch: Science (from the Parent class)
        // Specialization: Physics (from the Child class)
}

/*
• Initialization Chain: 
    When you create a child object, it is still technically a "Parent" as well. Using super() ensures that the parent's variables are properly initialized before the child starts adding its own data.

• Accessing Original Behavior: 
    > If you override a method to add new functionality (like in OOPS203), you often still want the old functionality to happen too. 
    > super.methodName() allows you to reuse the parent's logic instead of rewriting it.
*/