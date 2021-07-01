import order.BaseAbstractOrder;
import order.CommodityOrder;
import order.CompoundOrder;
import order.ShippingOrder;
import order.TaxOrder;

import java.math.BigDecimal;

/**
 * @author 霖
 */
public class Main {

    public static void main(String[] args) {
        CompoundOrder compoundOrder = new CompoundOrder();
        compoundOrder.add(new CommodityOrder(1, BaseAbstractOrder.OrderStatus.INIT, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1)));
        compoundOrder.add(new ShippingOrder(1, BaseAbstractOrder.OrderStatus.INIT, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1)));
        compoundOrder.add(new TaxOrder(1, BaseAbstractOrder.OrderStatus.INIT, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1)));

        BigDecimal bigDecimal = compoundOrder.orderPrice();
        Integer amount = compoundOrder.amount();
        System.out.println("bigDecimal:\n" + bigDecimal + "\n" + "amount:\n" + amount);
    }
}
