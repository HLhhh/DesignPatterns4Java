package instant;

/**
 * @author 霖
 */
public class Single {

    private final static Single SINGLE = new Single();

    private Single() {

    }

    public static Single getSingle() {
        return SINGLE;
    }
}
