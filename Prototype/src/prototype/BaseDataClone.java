package prototype;


/**
 * @author 霖
 */
public class BaseDataClone implements Cloneable {

    public int anInt;
    public long aLong;
    public double aDouble;
    public float aFloat;
    public char aChar;
    public short aShort;
    public byte aByte;
    public boolean aBoolean;
    public String aString;
    public Integer integer;
    public Colour colour;

    public static class Colour implements Cloneable {
        public int x;
        public int y;
        public int z;

        public Colour(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }


        @Override
        protected BaseDataClone.Colour clone() throws CloneNotSupportedException {
            return (BaseDataClone.Colour) super.clone();
        }
    }

    @Override
    protected BaseDataClone clone() throws CloneNotSupportedException {
        BaseDataClone clone = (BaseDataClone) super.clone();
        /**
         * 在Java中，除了8中基本的数据类型，其余都是浅拷贝，就连String也是一样。
         * clone.aString = new String(this.aString);
         */
        /**
         * 这里是String的常量池特性，“abc”和“abc”同一内存指向
         * clone.aString = this.aString;
         */
        /**
         * Java会自动拆包解包，导致== 在基本包装类型中不能比较地址
         * clone.integer = new Integer(this.integer);
         */
        /**
         * 注掉这一行，Java就会只浅拷贝，非基本数据类型只会拷贝引用对象。所以克隆后的新对象与原型equals相比，返回为false
         * clone.colour = this.colour.clone();
         */
        return clone;
    }

    public static void main(String[] args) {
        BaseDataClone baseDataClone = initPrototype();
        try {
            BaseDataClone clone = baseDataClone.clone();

            System.out.println(clone.aString == baseDataClone.aString);
            baseDataClone.aString = "exString";
            System.out.println(clone.aString);

            System.out.println(clone.anInt == baseDataClone.anInt);

            System.out.println(clone.integer == baseDataClone.integer);
            baseDataClone.integer = 2;
            System.out.println(clone.integer);

            System.out.println(clone.colour == baseDataClone.colour);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private static BaseDataClone initPrototype() {
        BaseDataClone baseDataClone = new BaseDataClone();
        baseDataClone.anInt = 5;
        baseDataClone.aString = "aString";
        baseDataClone.integer = 1;
        baseDataClone.colour = new Colour(1, 1, 1);
        return baseDataClone;
    }

}
