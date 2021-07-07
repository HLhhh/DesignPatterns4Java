import decorator.CompressionDecorator;
import decorator.EncryptionDecorator;
import decorator.FileDataSource;

/**
 * @author 霖
 */
public class Main {

    public static void main(String[] args) {
        new CompressionDecorator(new EncryptionDecorator(new FileDataSource("/user/a.inc"))).write("12345");
    }
}
