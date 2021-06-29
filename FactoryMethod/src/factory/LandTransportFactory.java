package factory;

import instance.LandTransport;
import instance.Transport;

/**
 * @author 霖
 */
public class LandTransportFactory implements TransportFactory {
    @Override
    public Transport createTransportInstance() {
        return new LandTransport();
    }
}
