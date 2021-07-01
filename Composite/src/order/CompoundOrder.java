package order;

import java.math.BigDecimal;

/**
 * @author 霖
 */
public class CompoundOrder extends BaseAbstractOrder {
    public CompoundOrder(BigDecimal profit) {
        super(profit);
    }

    public CompoundOrder(Integer amount, OrderStatus status, BigDecimal orderPrice, BigDecimal profit) {
        super(amount, status, orderPrice, profit);
    }

    @Override
    public BigDecimal orderPrice() {
        return null;
    }

    @Override
    public Integer amount() {
        return null;
    }
}
