package factory;

import instance.LandTransport;
import instance.Transport;

/**
 * @author 霖
 */
public class LandTransportFactory {
    public Transport createTransportInstance() {
        return new LandTransport();
    }
}
