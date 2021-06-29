package abstractfactory;


import instance.Furniture;

/**
 * @author 霖
 */
public interface AbstractFurnitureFactory<T extends Furniture> {

    T createTransportInstance();
}
