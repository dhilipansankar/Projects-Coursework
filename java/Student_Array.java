class Student
{
    String name;
    int student_id;
    float marks;
    static int count;
    //Constructor overloading (same name with different form/implementation
    Student(String n1, int id, float m1)                                                 //Paramterized Constructor
    {
        this.name = n1;
        this.student_id=id;
        this.marks = m1;
        count = count +1;
    }
    Student()               //default constructor
    {
        System.out.println("inside default constructor...");
        count = count +1;
    }

    void displayStudentDetails()
    {
        System.out.println("student name = "+this.name);
        System.out.println("Student ID="+this.student_id);
        System.out.println("Student marks="+this.marks);
    }

    static int getCount()
    {
        return count;
    }

    //Method Overloading
    void display(){System.out.println("Inside display method.....");}
    void display(String msg){System.out.println("Inside display method with one parameter.....");
    System.out.println("Msg="+msg);
    }
    //void display(){system.out.println("Inside display method....);} compilation error duplicate method not allowed
}


public class Student_Array
{
    public static void main(String args[])
    {
        //Array of student 3 objects
        Student s[] = new Student[3];
        s[0] = new Student("Balaji",1,99);
        s[1] = new Student("Nirgun",2,89);
        s[2] = new Student("Mayur",3,79);
        for (int i=0; i<s.length;i++)
        {
            System.out.println("details of Student:"+(i+1));
            s[i].displayStudentDetails();
            System.out.println("........................................");
        }
    }
}