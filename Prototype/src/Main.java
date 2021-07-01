import prototype.PixelPrototype;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author 霖
 */
public class Main {

    public static void main(String[] args) {
        PixelPrototype pixelPrototype = new PixelPrototype(0, 0, new PixelPrototype.Colour(1, 2, 3));
        Set<PixelPrototype> set = new HashSet<>();
        set.add(pixelPrototype);
        for (int i = 0; i < 2000; i++) {
            PixelPrototype clone = pixelPrototype.clone();
            System.out.println(set.add(clone));
        }
    }
}
