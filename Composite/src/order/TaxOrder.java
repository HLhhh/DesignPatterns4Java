package order;

import java.math.BigDecimal;

/**
 * @author 霖  组合
 */
public class TaxOrder extends BaseAbstractOrder {

    public BigDecimal taxPrice = BigDecimal.valueOf(0.035);

    public TaxOrder(BigDecimal profit) {
        super(profit);
    }

    public TaxOrder(Integer amount, OrderStatus status, BigDecimal orderPrice, BigDecimal profit) {
        super(amount, status, orderPrice, profit);
    }

    @Override
    public BigDecimal orderPrice() {
        return orderPrice.multiply(taxPrice);
    }

    @Override
    public Integer amount() {
        return ZERO;
    }
}
