/* ----- CONSTRUCTORS -----
• What is a Constructor? A constructor is a special "method" that is called automatically when you create an object using the new keyword.

• The Rules:
    1. It must have the exact same name as the class.
    2. It does not have a return type (not even void).

• Purpose: Its primary job is initialization—giving initial values to the data members of the class so the object is ready to use immediately.
*/

class Student {
    String name;
    int rollNo;

    Student(String n, int r) {
        // This is the CONSTRUCTOR
        // It has the same name as the class and no return type
        
        name = n;    
        // Initializing the 'name' variable
        
        rollNo = r;  
        // Initializing the 'rollNo' variable
        System.out.println("Constructor called! Object initialized.");
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        // Now, we pass the data inside the parentheses during creation
        // This automatically triggers the constructor above

        Student s1 = new Student("Shivang", 052); 
        
        s1.display();
    }
}

/*
• Efficiency: You don't have to write multiple lines of code to assign values one by one after creating the object.

• Consistency: You can ensure that every object created must have certain data (like a name) by requiring it in the constructor.
*/