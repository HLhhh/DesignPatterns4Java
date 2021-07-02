package hole;

import characteristic.RoundHoleCharacteristic;

/**
 * 放空适配器，用来适配圆孔
 *
 * @author 霖
 */
public class SquarePegAdapter extends RoundPeg implements RoundHoleCharacteristic {

    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return squarePeg.getH() * squarePeg.getW();
    }

    /**
     * 在这里我特意不让方孔适配器拥有圆孔的特性。
     */
    @Override
    public void roundHoleCharacteristic() {
        throw new RuntimeException("sorry i am SquarePeg!!");
    }
}
