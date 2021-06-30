package standard.builder;

import standard.accessories.BatteryEnum;
import standard.accessories.ScreenEnum;
import standard.accessories.WebcamEnum;
import standard.instance.HuaweiPhone;

/**
 * @author 霖
 */
public class HuaweiPhoneBuilder implements Builder<HuaweiPhone> {

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
    public HuaweiPhone getInstance() {
        return new HuaweiPhone(battery, screen, webcam);
    }


}
