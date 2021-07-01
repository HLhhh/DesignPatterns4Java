package order;

import java.math.BigDecimal;

/**
 * 订单抽象类
 *
 * @author 霖
 */
public interface AbstractOrder {

    /**
     * 价格
     *
     * @return 价格
     */
    BigDecimal orderPrice();

    /**
     * 数量
     *
     * @return int
     */
    Integer amount();

    /**
     * 订单完成
     */
    void consummation();

    /**
     * 订单关闭
     */
    void close();
}
