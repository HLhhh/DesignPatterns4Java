package decorator;

/**
 * @author 霖
 */
public class DataSourceDecorator implements DataSource {

    private final DataSource decorator;

    public DataSourceDecorator(DataSource decorator) {
        this.decorator = decorator;
    }

    @Override
    public void write(String data) {
        decorator.write(data);
    }

    @Override
    public String read() {
        return decorator.read();
    }
}
