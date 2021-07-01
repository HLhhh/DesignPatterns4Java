package order;

import java.math.BigDecimal;

/**
 * @author 霖
 */
public class CommodityOrder extends BaseAbstractOrder {

    public CommodityOrder(BigDecimal profit) {
        super(profit);
    }

    public CommodityOrder(Integer amount, OrderStatus status, BigDecimal orderPrice, BigDecimal profit) {
        super(amount, status, orderPrice, profit);
    }

    @Override
    public BigDecimal orderPrice() {
        return this.orderPrice.multiply(this.profit);
    }

    @Override
    public Integer amount() {
        return this.amount;
    }
}
