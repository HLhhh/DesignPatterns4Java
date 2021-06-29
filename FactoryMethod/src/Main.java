import factory.AirTransportFactory;
import factory.LandTransportFactory;
import factory.SeaTransportFactory;
import instance.Transport;

/**
 * @author 霖
 */
public class Main {

    public static void main(String[] args) {
        Transport transport1 = new AirTransportFactory().createTransportInstance();
        Transport transport2 = new LandTransportFactory().createTransportInstance();
        Transport transport3 = new SeaTransportFactory().createTransportInstance();
    }
}
