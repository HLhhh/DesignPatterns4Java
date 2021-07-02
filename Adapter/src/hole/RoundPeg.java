package hole;

import characteristic.RoundHoleCharacteristic;

/**
 * 圆钉
 *
 * @author 霖
 */
public class RoundPeg implements RoundHoleCharacteristic {

    private double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public RoundPeg() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void roundHoleCharacteristic() {

    }
}
