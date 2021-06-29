package factory;

import abstractfactory.AbstractFurnitureFactory;
import instance.AbstractBed;
import instance.AbstractChair;
import instance.ChairInstance;

/**
 * @author 霖
 */
public class ChairFactory implements AbstractFurnitureFactory<AbstractChair> {

    @Override
    public AbstractChair createTransportInstance() {
        return new ChairInstance();
    }
}
