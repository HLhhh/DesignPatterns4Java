package interfacemode.serivce.proxy;

import interfacemode.serivce.ServiceInterface;

/**
 * @author 霖
 */
public class ServiceProxy implements ServiceInterface {

    private final ServiceInterface realService;

    public ServiceProxy(ServiceInterface realService) {
        this.realService = realService;
    }

    @Override
    public void operating() {
        //作为代理的一些校验
        this.checkAccess();
        realService.operating();
    }

    public void checkAccess() {
    }
}
