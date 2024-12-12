package work8;
/**
 * Main class which creates stewards, game space, adds chips to the list and checks if more than one distributor can be created
 */
public class Client {
    /**
     * Method that creates stewards, playing field, chips and checks whether it is possible to create more than one distributor
     */
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getinstance();
        singleton1.setgamefield("Game field");
        singleton1.addtoken("Сhip 1");
        singleton1.addtoken("Сhip 2");

        singleton1.printgamestate();

        Singleton singleton2 = Singleton.getinstance();
        singleton2.addtoken("Сhip 3");
        singleton1.printgamestate();

        System.out.println(singleton1 == singleton2);
    }
}