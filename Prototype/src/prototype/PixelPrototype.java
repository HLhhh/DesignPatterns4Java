package prototype;

import java.util.Objects;

/**
 * @author 霖
 */
public class PixelPrototype implements Cloneable {

    private int x;
    private int y;
    private Colour colour;

    public PixelPrototype(int x, int y, Colour colour) {
        this.x = x;
        this.y = y;
        this.colour = colour;
    }

    @Override
    public PixelPrototype clone() {
        PixelPrototype clone = null;
        try {
            clone = (PixelPrototype) super.clone();
            //注掉这一行，Java就会只浅拷贝，非基本数据类型只会拷贝引用对象。所以克隆后的新对象与原型equals相比，返回为false
            //clone.colour = this.colour.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public static class Colour implements Cloneable {
        private int x;
        private int y;
        private int z;

        public Colour(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }


        @Override
        protected Colour clone() throws CloneNotSupportedException {
            return (Colour) super.clone();
        }
    }


    @Override
    public String toString() {
        return "PixelPrototype{" +
                "x=" + x +
                ", y=" + y +
                ", colour=" + colour +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PixelPrototype that = (PixelPrototype) o;
        return x == that.x && y == that.y && colour.equals(that.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, colour);
    }
}
