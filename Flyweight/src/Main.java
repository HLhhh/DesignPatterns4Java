import pixel.Pixel;
import pixel.PixelFactory;
import pixel.PixelType;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 霖
 */
public class Main {
    public static void main(String[] args) {
        List<Pixel> pixelList = new LinkedList<>();
        List<Pixel> pixelList2 = new LinkedList<>();
        for (int i = 0; i < 2000; i++) {
            for (int j = 0; j < 2000; j++) {
                pixelList.add(PixelFactory.createPixel(i, j));
                pixelList2.add(new Pixel(new PixelType("colout", 0), i, j));
            }
        }
    }
    //这里可以比较pixelList 和 pixelList2 内存的大小
}
