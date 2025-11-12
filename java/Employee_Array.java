class Employee {

    String name;
    int employee_id;
    float salary;
    static int count;

    Employee(String n1, int id, float s1) {
        this.name = n1;
        this.employee_id = id;
        this.salary = s1;
        count = count + 1;
    }

    Employee() {
        System.out.println("inside default constructor...");
        count = count + 1;
    }

    void displayEmployeeDetails() {
        System.out.println("employee name = " + this.name);
        System.out.println("Employee ID=" + this.employee_id);
        System.out.println("Employee salary=" + this.salary);
    }

    static int getCount() {
        return count;
    }
}

public class Employee_Array {

    public static void main(String args[]) {

        Employee e[] = new Employee[3];
        e[0] = new Employee("Bezos", 1, 150000);
        e[1] = new Employee("Pichai", 2, 200000);
        e[2] = new Employee("Nadela", 3, 180000);

        for (int i = 0; i < e.length; i++) {
            System.out.println("Details of Employee " + (i + 1));
            e[i].displayEmployeeDetails();
        }
        System.out.println("Total Employee Objects=" + Employee.getCount());
    }
}
