package lazy;

/**
 * @author 霖
 */
public class Single {

    private static volatile Single single;

    private Single() {
    }

    private static Single getSingle() {
        if (single == null) {
            synchronized (Single.class) {
                single = new Single();
            }
        }
        return single;
    }
}

