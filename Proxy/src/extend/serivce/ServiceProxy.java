package extend.serivce;

/**
 * 继承形式的代理
 *
 * @author 霖
 */
public class ServiceProxy extends ServiceImpl {


    @Override
    public void operating() {
        checkAccess();
        super.operating();
    }

    public void checkAccess() {
    }
}
