package Question2;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Employee employee=new Employee(scanner.next(),scanner.nextInt(),scanner.next(),scanner.nextDouble(),
                scanner.next(), scanner.next());
        Manager manager=new Manager(scanner.next(),scanner.nextInt(),scanner.next(),scanner.nextDouble(),
                scanner.next(), scanner.next());
        System.out.println("employee name : " + employee.getName());
        System.out.println("employee age : "+ employee.getAge());
        employee.PrintSalary();
        System.out.println("employee specialization : " + employee.getSpecialization());
        System.out.println("employee department : "+ employee.getDepartment());
        System.out.println("***********************************************************************************");
        System.out.println("manager name : " + manager.getName());
        System.out.println("manager age : "+ manager.getAge());
        manager.PrintSalary();
        System.out.println("manager specialization : " + manager.getSpecialization());
        System.out.println("manager department : "+ manager.getDepartment());


    }
}
