package hole;

import characteristic.RoundHoleCharacteristic;

/**
 * 圆孔
 * 接口圆孔的特性
 *
 * @author 霖
 */
public class RoundHole {
    private double radius;

    public RoundHole() {
    }

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public RoundPeg fits(RoundPeg peg) {
        if (this.getRadius() >= peg.getRadius()) {
            return peg;
        }
        return null;
    }

}
