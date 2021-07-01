package order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 霖
 */
public class CompoundOrder extends BaseAbstractOrder {

    private final List<AbstractOrder> ORDER_LIST = new ArrayList<>();

    public void add(AbstractOrder order) {
        ORDER_LIST.add(order);
    }

    public CompoundOrder() {
        super(null);
    }

    public CompoundOrder(BigDecimal profit) {
        super(profit);
    }

    public CompoundOrder(Integer amount, OrderStatus status, BigDecimal orderPrice, BigDecimal profit) {
        super(amount, status, orderPrice, profit);
    }

    @Override
    public BigDecimal orderPrice() {
        return ORDER_LIST.stream().map(AbstractOrder::orderPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public Integer amount() {
        return ORDER_LIST.stream().map(AbstractOrder::amount).mapToInt(Integer::intValue).sum();
    }
}
