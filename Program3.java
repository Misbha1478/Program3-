class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Person Name: " + name);
    }

    void displayAge(int birthYear, int birthMonth, int birthDay) {
        // Hardcoded today's date (you can modify this)
        int currentYear = 2025;
        int currentMonth = 5;  // May
        int currentDay = 13;

        int age = currentYear - birthYear;

        // If birthday hasn't occurred yet this year, subtract 1
        if (birthMonth > currentMonth || (birthMonth == currentMonth && birthDay > currentDay)) {
            age--;
        }

        System.out.println("Age: " + age + " years");
    }
}

class Employee extends Person {
    String empId;
    double salary;

    Employee(String name, String empId, double salary) {
        super(name);
        this.empId = empId;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: ₹" + salary);
    }
}

public class Program3 {
    public static void main(String[] args) {
        Employee emp = new Employee("Yaseen", "EMP123", 55000.0);

        emp.displayName();
        emp.displayAge(2002, 8, 15); // YYYY, MM, DD format
        emp.displayEmployeeDetails();
    }
}
