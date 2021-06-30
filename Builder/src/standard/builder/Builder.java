package standard.builder;

import standard.accessories.BatteryEnum;
import standard.accessories.ScreenEnum;
import standard.accessories.WebcamEnum;

/**
 * @author 霖
 */
public interface Builder<T> {

    /**
     * 定制屏幕
     *
     * @param screen 屏幕类
     */
    void setScreen(ScreenEnum screen);

    /**
     * 定制摄像头
     *
     * @param webcam 摄像头
     */
    void setWebcam(WebcamEnum webcam);

    /**
     * 定制电池
     *
     * @param battery 电池
     */
    void setBattery(BatteryEnum battery);

    /**
     * 获得实体类
     * @return t
     */
    T getInstance();
}
