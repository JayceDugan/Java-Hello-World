import java.io.*;
public class EmployeeTest {
    public static void main(String []args) {
        Employee empOne = new Employee("Janes Smith");
        Employee empTwo = new Employee("Smith Janes");

        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(135000);
        empOne.printEmployee();

        empTwo.empAge(25);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(125000);
        empTwo.printEmployee();
    }
}

