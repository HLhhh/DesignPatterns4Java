package standard;

import standard.builder.ApplePhoneBuilder;
import standard.builder.HuaweiPhoneBuilder;
import standard.instance.ApplePhone;
import standard.instance.HuaweiPhone;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        ApplePhoneBuilder applePhoneBuilder = new ApplePhoneBuilder();

        director.constructLowProfileApple(applePhoneBuilder);
        ApplePhone applePhone1 = applePhoneBuilder.getInstance();

        director.constructHighProfileApple(applePhoneBuilder);
        ApplePhone applePhone2 = applePhoneBuilder.getInstance();

        HuaweiPhoneBuilder huaweiPhoneBuilder = new HuaweiPhoneBuilder();

        director.constructHighProfileHuawei(huaweiPhoneBuilder);
        HuaweiPhone instance = huaweiPhoneBuilder.getInstance();

        director.constructLowProfileHuawei(huaweiPhoneBuilder);
        HuaweiPhone instance1 = huaweiPhoneBuilder.getInstance();
    }
}
