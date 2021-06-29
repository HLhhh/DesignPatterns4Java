package factory;

import instance.SeaTransport;
import instance.Transport;

/**
 * @author 霖
 */
public class SeaTransportFactory {
    public Transport createTransportInstance() {
        return new SeaTransport();
    }
}
