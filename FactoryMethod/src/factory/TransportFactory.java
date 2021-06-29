package factory;

import instance.Transport;

/**
 * @author 霖
 */
public interface TransportFactory {

    /**
     * 生成运输工具实体
     *
     * @return currentInstance
     */
    Transport createTransportInstance();
}
