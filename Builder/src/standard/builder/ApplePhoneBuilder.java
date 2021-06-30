package standard.builder;

import standard.accessories.BatteryEnum;
import standard.accessories.ScreenEnum;
import standard.accessories.WebcamEnum;
import standard.instance.ApplePhone;

/**
 * @author 霖
 */
public class ApplePhoneBuilder implements Builder<ApplePhone> {

    private BatteryEnum battery;
    private ScreenEnum screen;
    private WebcamEnum webcam;

    @Override
    public void setScreen(ScreenEnum screen) {
        this.screen = screen;
    }

    @Override
    public void setWebcam(WebcamEnum webcam) {
        this.webcam = webcam;
    }

    @Override
    public void setBattery(BatteryEnum battery) {
        this.battery = battery;
    }

    @Override
    public ApplePhone getInstance() {
        return new ApplePhone(battery, screen, webcam);
    }

}
