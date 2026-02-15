/* ----- CONSTRUCTOR OVERLOADING -----
• What is it? Constructor Overloading allows a class to have more than one constructor, for when user specifies different number or types of parameters in the constructor.

• The Rule: Each constructor must have a different "signature." This means they must differ in the number of parameters or the data types of the parameters.

• The Benefit: It allows you to create objects in different ways depending on what information you have at the time. You can have a "default" student with no name yet, or a student where you only know their name, or a student where you know everything.
*/

class Student {
    String name;
    int rollNo;
    String branch;

    Student(String n, int r) {
        // This is the CONSTRUCTOR
        // It has the same name as the class and no return type
        
        name = n;    
        // Initializing the 'name' variable
        
        rollNo = r;  
        // Initializing the 'rollNo' variable
        System.out.println("Constructor called! Object initialized.");
    }

    Student(int x, String m, String bra){
        rollNo = x;
        name = m;
        branch = bra;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Branch: " + branch);
    }

    public static void main(String[] args) {
        // Now, we pass the data inside the parentheses during creation
        // This automatically triggers the constructor above

        Student s1 = new Student("Shivang", 052, "AI & ML"); 
        // null is printed in place if one of the parameters is not passed

        s1.display();
    }
}

/*
• Flexibility: You are no longer "locked in" to one way of creating an object.

• Safety: You can provide default values (like "Unknown") so that your program doesn't crash if some data is missing.
*/