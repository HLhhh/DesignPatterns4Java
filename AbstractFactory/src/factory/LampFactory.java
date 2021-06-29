package factory;

import abstractfactory.AbstractFurnitureFactory;
import instance.AbstractChair;
import instance.AbstractTableLamp;
import instance.LampInstance;

/**
 * @author 霖
 */
public class LampFactory implements AbstractFurnitureFactory<AbstractTableLamp> {

    @Override
    public AbstractTableLamp createTransportInstance() {
        return new LampInstance();
    }
}
