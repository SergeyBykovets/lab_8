package work8;
import java.util.List;
import java.util.ArrayList;
/**
 * Class implements a game manager consisting of a game space and a list of game chips
 *
 * @author Bykovets Sergey
 */
public class Singleton {
    /**
     * The only instance of the Singleton class
     */
    private static Singleton instance;
    /**
     * Game space, the scene of the game
     */
    private String gamefield;
    /**
     * List of game chips
     */
    private List<String> gametokens;
    /**
     * Singleton class constructor, initializes the list of game chips
     */
    private Singleton() {
        gametokens = new ArrayList<>();
    }
    /**
     * A method to get a single instance of the Singleton class
     *
     * @return Singleton single instance
     */
    public static Singleton getinstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    /**
     * Method for setting the playing field
     *
     * @param gamefield playing field
     */
    public void setgamefield(String gamefield) {
        this.gamefield = gamefield;
    }
    /**
     * Returns game field
     *
     * @return game field
     */
    public String getgamefield() {
        return gamefield;
    }
    /**
     * Adds a new game chip to the list
     *
     * @param token game chip
     */
    public void addtoken(String token) {
        gametokens.add(token);
    }
    /**
     * Returns a list of all game chips
     *
     * @return list of game chips
     */
    public List<String> getgameTokens() {
        return gametokens;
    }
    /**
     * Method that writes game space to the console
     * and a list of chips.
     */
    public void printgamestate() {
        System.out.println("Game field: " + gamefield);
        System.out.println("Game tokens: " + gametokens);
    }
}
