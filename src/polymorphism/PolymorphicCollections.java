package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PolymorphicCollections {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        System.out.println("-----Cat Object-----\n");
        cat1.eat();
        cat1.sleep();
        cat1.eat("fish");

        System.out.println("\n-----Dog Object-----\n");
        dog1.eat();
        dog1.sleep();
        dog1.eat("meat");

        System.out.println("\n-----Animal Object-----\n");
        Animal animal1 = new Animal();
        animal1.eat(); // Animal eats
        animal1.eat("some food"); // Animal eats some food
        animal1.sleep(); // Animals sleeps

        System.out.println("\n-----Cat and Dog Object in Animal Shape-----\n");
        Animal cat2 = new Cat();
        Animal dog2 = new Dog();

        cat2.eat();
        cat2.sleep();
        dog2.eat();
        dog2.sleep();

        //Animal, Cat, Dog

        Animal[] animals = {cat1, dog1, animal1, cat2, dog2};

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
        }


        System.out.println("\n-----ArrayList Collection of Animals-----\n");
//        ArrayList<Animal> animalsList = new ArrayList<>(Arrays.asList(animals));
//
//        for (Animal animal : animalsList) {
//            animal.eat();
//        }
//        animalsList.forEach(Animal::eat);

        new ArrayList<>(Arrays.asList(animals)).forEach(Animal::eat); //anonymous object

    }
}
