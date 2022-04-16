package encapsulation;

import java.util.Scanner;

public class EmployeeClub {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Please enter your full name");
        emp.setFullName(inputReader.nextLine());

        System.out.println("Please enter your age");
        emp.setAge(inputReader.nextInt());

        inputReader.nextLine();

        System.out.println("Please enter your address");
        emp.setAddress(inputReader.nextLine());

        System.out.println(emp);

        if(emp.getAddress().toLowerCase().contains("chicago") && emp.getAge() > 21){
            System.out.println(emp.getFullName() + " is in the club");
        }
        else System.out.println(emp.getFullName() + " is not in the club");

    }
}
