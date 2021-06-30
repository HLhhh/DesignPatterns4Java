package standard.instance;

import standard.accessories.BatteryEnum;
import standard.accessories.ScreenEnum;
import standard.accessories.WebcamEnum;

/**
 * @author 霖
 */
public class HuaweiPhone {

    private final BatteryEnum battery;
    private final ScreenEnum screen;
    private final WebcamEnum webcam;

    public HuaweiPhone(BatteryEnum battery, ScreenEnum screen, WebcamEnum webcam) {
        this.battery = battery;
        this.screen = screen;
        this.webcam = webcam;
    }

    public BatteryEnum getBattery() {
        return battery;
    }

    public ScreenEnum getScreen() {
        return screen;
    }

    public WebcamEnum getWebcam() {
        return webcam;
    }
}
