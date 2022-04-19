package inheritance;

public class Vegetable extends Food{

    public String color;
    /*
    Create a food1 object and define below info for it
    taste = delicious
    name = sushi
    isSpicy = true
    isOrganic = true

    First, print the name of the food
    Then, print if the food is organic
    Finally, print the object itself
     */

    @Override
    public String toString() {
        return "Vegetable{" +
                "taste='" + taste + '\'' +
                ", name='" + name + '\'' +
                ", isSpicy=" + isSpicy +
                ", isOrganic=" + isOrganic() +
                ", color='" + color + '\'' +
                '}';
    }
}
