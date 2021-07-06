package pixel;


/**
 * @author 霖
 */
public class PixelFactory {

    private static volatile PixelType pixelType;

    public static Pixel createPixel(int x, int y) {
        //将对象的内部状态存起来，循环利用
        if (pixelType == null) {
            pixelType = new PixelType("colout", 0);
        }
        //将内部对象的应用+外部状态=所需要的对象
        return new Pixel(pixelType, x, y);
    }

}
