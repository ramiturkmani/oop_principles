package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {

        /*
        Create an object of Samsung called as s1
        info it will have is as below

        Samsung
        Black
        64
        700
         */

        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        IPhone i1 = new IPhone("Apple", "Silver", 128, 1000);

        List<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);

        int count = 0;
        double maxPrice = Integer.MIN_VALUE;
        Phone mostExpensivePhone = null;

        for (Phone phone : phones) {
            System.out.println(phone);
            if (phone.isConvertible()) count++;
            if (phone.price > maxPrice) mostExpensivePhone = phone;
        }
        System.out.println("The most expensive phone is = " + mostExpensivePhone.getClass().getSimpleName());

        System.out.println(count);

        System.out.println(IPhone.OS);
        System.out.println(Samsung.OS);
        System.out.println(Nokia.OS);

        for (Phone phone : phones) {
            phone.call();
            phone.ring();
            phone.text();
        }
    }
}
