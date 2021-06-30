package classic;

/**
 * 简化版的建造者模式
 * @author 霖
 */
public class Computer {

    private final String cpu;
    private final String ram;
    private final int usbCount;
    private final String keyboard;
    private final String display;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }

    public static class Builder {
        private final String cpu;
        private final String ram;
        private int usbCount;
        private String keyboard;
        private String display;

        public Builder(String cup, String ram) {
            this.cpu = cup;
            this.ram = ram;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public int getUsbCount() {
        return usbCount;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getDisplay() {
        return display;
    }
}
