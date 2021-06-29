package factory;

import abstractfactory.AbstractFurnitureFactory;
import instance.AbstractBed;
import instance.BedInstance;

/**
 * @author 霖
 */
public class BedFactory implements AbstractFurnitureFactory<AbstractBed> {

    @Override
    public AbstractBed createTransportInstance() {
        return new BedInstance();
    }
}
