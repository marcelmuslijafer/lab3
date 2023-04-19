package hr.fer.oop.lab3.zadatak1;

/**
 * Class that describes a formation.
 */
public class Formation {

    private final int df;
    private final int mf;
    private final int fw;

    private Formation(int df, int mf, int fw) {
        this.df = df;
        this.mf = mf;
        this.fw = fw;
    }

    public int getDf() {
        return df;
    }

    public int getMf() {
        return mf;
    }

    public int getFw() {
        return fw;
    }

    /**
     * 4-4-2 formation
     */
    private static final Formation f442 = new Formation(4, 4, 2);

    /**
     * 3-5-2 formation
     */
    private static final Formation f352 = new Formation(3, 5, 2);

    /**
     * 5-4-1 formation
     */
    private static final Formation f541 = new Formation(5, 4, 1);

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
