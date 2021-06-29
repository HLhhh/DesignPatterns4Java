package factory;

import instance.AirTransport;
import instance.Transport;

/**
 * @author 霖
 */
public class AirTransportFactory {
    public Transport createTransportInstance() {
        return new AirTransport();
    }
}
