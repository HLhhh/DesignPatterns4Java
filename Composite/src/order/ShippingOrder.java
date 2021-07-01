package order;

import sun.awt.geom.Crossings;

import java.math.BigDecimal;

/**
 * @author 霖
 */
public class ShippingOrder extends BaseAbstractOrder {

    public double weight;

    public ShippingOrder(BigDecimal profit) {
        super(profit);
    }

    public ShippingOrder(Integer amount, OrderStatus status, BigDecimal orderPrice, BigDecimal profit) {
        super(amount, status, orderPrice, profit);
    }

    @Override
    public BigDecimal orderPrice() {
        return this.orderPrice;
    }

    @Override
    public Integer amount() {
        return ZERO;
    }
}
