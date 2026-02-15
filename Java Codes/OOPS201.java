/* ----- The THIS Keyword -----
• What is it? In Java, this is a ***reference variable*** that refers to the current object.

• Variable Conflict: A conflict occurs when a "local variable" (like a parameter in a constructor) has the same name as an "instance variable" (the variable belonging to the class).

• The Solution: By using this.variableName, you are telling Java: 
    "I am talking about the variable that belongs to this specific object, not the temporary parameter in this method."
*/

class Student {
    String name;
    int rollNo;
    String branch;

    Student(int rollNo, String name, String branch){
        this.branch = branch;
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Branch: " + branch);
    }

    public static void main(String[] args) {
        // Now, we pass the data inside the parentheses during creation
        // This automatically triggers the constructor above

        Student s1 = new Student(052, "Shivang", "AI & ML"); 
        // null is printed in place if one of the parameters is not passed

        s1.display();
    }
}

/*

• Readability: You don't have to come up with "fake" names like n, r, or my_name. You can use the most logical name for your data everywhere.

• Standard Practice: In professional Java development, almost all constructors and "setter" methods use the this keyword to *** map *** parameters to object data.
*/