package standard;

import classic.Computer;
import standard.accessories.BatteryEnum;
import standard.accessories.ScreenEnum;
import standard.accessories.WebcamEnum;
import standard.builder.Builder;
import standard.instance.ApplePhone;
import standard.instance.HuaweiPhone;

/**
 * @author 霖
 */
public class Director {

    public void constructHighProfileHuawei(Builder<HuaweiPhone> builder) {
        builder.setBattery(BatteryEnum.HIGH);
        builder.setWebcam(WebcamEnum.HIGH);
        builder.setScreen(ScreenEnum.MADE_IN_CHINA);
    }

    public void constructLowProfileHuawei(Builder<HuaweiPhone> builder) {
        builder.setBattery(BatteryEnum.LOW);
        builder.setWebcam(WebcamEnum.LOW);
        builder.setScreen(ScreenEnum.MADE_IN_CHINA);
    }

    public void constructHighProfileApple(Builder<ApplePhone> builder) {
        builder.setBattery(BatteryEnum.HIGH);
        builder.setWebcam(WebcamEnum.HIGH);
        builder.setScreen(ScreenEnum.INLET);
    }

    public void constructLowProfileApple(Builder<ApplePhone> builder) {
        builder.setBattery(BatteryEnum.LOW);
        builder.setWebcam(WebcamEnum.LOW);
        builder.setScreen(ScreenEnum.INLET);
    }
}
