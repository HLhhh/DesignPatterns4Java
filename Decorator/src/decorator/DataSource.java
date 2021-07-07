package decorator;

/**
 * @author 霖
 */
public interface DataSource {

    /**
     * 写
     *
     * @param data 数据
     */
    void write(String data);

    /**
     * 读
     *
     * @return 返回得str
     */
    String read();
}
