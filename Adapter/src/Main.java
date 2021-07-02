import hole.RoundHole;
import hole.RoundPeg;
import hole.SquarePeg;
import hole.SquarePegAdapter;

/**
 * @author 霖
 */
public class Main {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole();

        roundHole.fits(new RoundPeg()).roundHoleCharacteristic();
        roundHole.fits(new SquarePegAdapter(new SquarePeg())).roundHoleCharacteristic();
    }
}
