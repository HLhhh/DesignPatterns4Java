package decorator;

import java.util.Base64;

/**
 * 数据进行加密
 *
 * @author 霖
 */
public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void write(String data) {
        super.write(this.encode(data));
    }

    @Override
    public String read() {
        return this.decode(super.read());
    }

    /**
     * 加密操作
     *
     * @param data
     * @return
     */
    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    /**
     * 解密操作
     *
     * @param data
     * @return
     */
    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }

}
