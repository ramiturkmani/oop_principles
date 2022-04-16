package inheritance;

import package5.Singer;

import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {
        System.out.println("-------- Person 1 --------");
        Person person1 = new Person();

        person1.fName = "John";
        person1.lName = "Doe";
        person1.age = 45;
        person1.gender = "Male";
        person1.setDOB("01/01/1977");
        person1.setSSN("000-00-0000");

        Tester tester1 = new Tester();

        tester1.fName = "Abe";
        tester1.lName = "Kim";
        tester1.age = 20;
        tester1.gender = "Male";
        tester1.setDOB("01/12/2002");
        tester1.setSSN("111-11-1111");

        Singer singer1 = new Singer();

        singer1.fName = "Kaly";
        singer1.lName = "Ngo";
        singer1.age = 15;
        singer1.gender = "Female";
        singer1.setDOB("05/10/2007");
        singer1.setSSN("222-22-2222");

        Dancer dancer1 = new Dancer();

        dancer1.fName = "Alona";
        dancer1.lName = "Q";
        dancer1.age = 15;
        dancer1.gender = "Female";
        dancer1.setDOB("10/10/2007");
        dancer1.setSSN("333-33-3333");

        System.out.println(person1);
        System.out.println(tester1);
        System.out.println(singer1);
        System.out.println(dancer1);

        System.out.println("-------- Person 2 --------");

        Person person2 = new Person("Jane", "Doe", 45, "Female");
        person2.setDOB("01/01/1977");
        person2.setSSN("555-55-5555");

        Tester tester2 = new Tester("Yung", "Kim", 20, "Male");
        tester2.setDOB("01/12/2002");
        tester2.setSSN("777-77-7777");

        Singer singer2 = new Singer("Jessie", "J", 15, "Female");
        singer2.setDOB("05/10/2007");
        singer2.setSSN("666-66-6666");

        Dancer dancer2 = new Dancer("B", "Q", 15, "Female");
        dancer2.setDOB("10/10/2007");
        dancer2.setSSN("999-99-9999");

        System.out.println(person2);
        System.out.println(tester2);
        System.out.println(singer2);
        System.out.println(dancer2);

        System.out.println("-------- Person ArrayList --------");
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person2);
        personList.add(tester2);
        personList.add(singer2);
        personList.add(dancer2);

        //personList.forEach(element -> System.out.println(element));
        personList.forEach(System.out::println);

        System.out.println("-------- Person Array --------");
        Person[] personArr = {person2, singer2, tester2, dancer2};

        for (Person person : personArr) {
            System.out.println(person);
        }

        tester1.code();
        dancer2.dance();
        singer1.sing();
    }
}
