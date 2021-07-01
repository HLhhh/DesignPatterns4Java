package order;

import java.math.BigDecimal;

import static order.BaseAbstractOrder.OrderStatus.CLOSE;
import static order.BaseAbstractOrder.OrderStatus.FINISH;

/**
 * 基本订单
 *
 * @author 霖
 */
public abstract class BaseAbstractOrder implements AbstractOrder {

    public Integer amount;
    public OrderStatus status;
    public BigDecimal orderPrice;
    public final BigDecimal profit;

    protected static final int ZERO = 0;

    public BaseAbstractOrder(BigDecimal profit) {
        this.profit = profit;
    }

    public BaseAbstractOrder(Integer amount, OrderStatus status, BigDecimal orderPrice, BigDecimal profit) {
        this.amount = amount;
        this.status = status;
        this.orderPrice = orderPrice;
        this.profit = profit;
    }

    @Override
    public void consummation() {
        status = CLOSE;
    }

    @Override
    public void close() {
        status = FINISH;
    }

    public enum OrderStatus {

        /**
         * 初始化
         */
        INIT,
        /**
         * 完成
         */
        FINISH,
        /**
         * 关闭
         */
        CLOSE;

        OrderStatus() {
        }
    }
}
