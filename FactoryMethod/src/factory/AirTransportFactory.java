package factory;

import instance.AirTransport;
import instance.Transport;

/**
 * @author 霖
 */
public class AirTransportFactory implements TransportFactory {
    @Override
    public Transport createTransportInstance() {
        return new AirTransport();
    }
}
