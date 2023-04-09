package hr.fer.oop.lab3;

/**
 * Class that describes a formation.
 */
public class Formation {

    /**
     * 4-4-2 formation
     */
    private static Formation f442 = new Formation();

    /**
     * 3-5-2 formation
     */
    private static Formation f352 = new Formation();

    /**
     * 5-4-1 formation
     */
    private static Formation f541 = new Formation();

    /**
     * @return the 4-4-2 formation
     */
    public static Formation F442() {
        return f442;
    }

    /**
     * @return the 3-5-2 formation
     */
    public static Formation F352() {
        return f352;
    }

    /**
     * @return the 5-4-1 formation
     */
    public static Formation F541() {
        return f541;
    }
}
