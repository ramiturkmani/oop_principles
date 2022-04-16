package encapsulation;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();

        //Setting info for make
        car1.make = "BMW";

        //Getting info of make
        System.out.println(car1.make);

        //Setting info for year
        car1.setYear(2015);

        //Getting info for year
        System.out.println(car1.getYear());


        car1.setPrice(5000, "helloworld");
        System.out.println(car1.getPrice());

    }
}
