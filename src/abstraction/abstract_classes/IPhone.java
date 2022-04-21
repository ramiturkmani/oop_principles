package abstraction.abstract_classes;

public class IPhone extends Phone implements Camera,BlueTooth{


    public static final String OS = "iOS";

    public IPhone(){

    }

    public IPhone(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public void call() {
        System.out.println("iPhone calls");
    }

    @Override
    public void ring() {
        System.out.println("iPhone rings");
    }

    @Override
    public void text() {
        System.out.println("iPhone texts");
    }

    @Override
    public boolean isConvertible() {
        return true;
    }

    @Override
    public void takesPhoto() {
        System.out.println("iPhone takes photos");
    }

    @Override
    public void connectBlueTooth() {

    }
}
