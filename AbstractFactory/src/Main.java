import abstractfactory.AbstractFurnitureFactory;
import factory.BedFactory;
import factory.ChairFactory;
import factory.LampFactory;
import instance.Furniture;

public class Main {

    public static void main(String[] args) {

        execue(new BedFactory());
        execue(new ChairFactory());
        execue(new LampFactory());
    }


    @SuppressWarnings("all")
    public static Furniture execue(AbstractFurnitureFactory abstractFurnitureFactory) {
        return abstractFurnitureFactory.createTransportInstance();
    }

}
