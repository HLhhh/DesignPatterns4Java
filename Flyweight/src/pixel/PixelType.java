package pixel;

/**
 * @author 霖
 */
public class PixelType {

    private String colour;
    private int bitInt;

    public PixelType(String colour, int bitInt) {
        this.colour = colour;
        this.bitInt = bitInt;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getBitInt() {
        return bitInt;
    }

    public void setBitInt(int bitInt) {
        this.bitInt = bitInt;
    }
}
