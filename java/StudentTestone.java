class Student
{
    String name = "Dhilipan";
    int studentid = 1;
    float marks = 96;
   
}

public class StudentTestone
{

    public static void main(String args[])
    {
        Student s1 = new Student();                     //method 

        System.out.println("Student name:"+s1.name);
        System.out.println("Student ID:"+s1.studentid);
        System.out.println("Student Marks:"+s1.marks);

        System.out.println("....................");

      
    }
}