public class WolfTest {

    public static void main (String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "male";
        wolf.wolfName = "Jacob";
        wolf.colour = "brown";
        wolf.weight = 80.0;
        wolf.age = 33;
        System.out.println("gender: " + wolf.gender);
        System.out.println("wolfName: " + wolf.wolfName);
        System.out.println("colour: " + wolf.colour);
        System.out.println("weight: " + wolf.weight);
        System.out.println("age: " + wolf.age);
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.hunt();
        wolf.howl();
    }
}