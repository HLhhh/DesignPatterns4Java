package pixel;

/**
 * @author 霖
 */
public class Pixel {

    private PixelType pixelType;
    private int x;
    private int y;

    public Pixel(PixelType pixelType, int x, int y) {
        this.pixelType = pixelType;
        this.x = x;
        this.y = y;
    }
}
