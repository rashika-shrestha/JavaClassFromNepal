package day15;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        String empName = input.next();
        System.out.println("Enter employee id: ");
        int empId = input.nextInt();
        System.out.println("Enter employee salary: ");
        double salary = input.nextDouble();
        Employee e1 = new Employee();
        e1.setEmpName(empName);
        e1.setEmpId(empId);
        e1.setSalary(salary);
        System.out.println(e1.getEmpName());
        System.out.println(e1.getEmpId());
        System.out.println(e1.getSalary());

    }
}
