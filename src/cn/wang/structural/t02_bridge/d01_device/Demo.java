package cn.wang.structural.t02_bridge.d01_device;

import cn.wang.structural.t02_bridge.d01_device.devices.Device;
import cn.wang.structural.t02_bridge.d01_device.devices.Radio;
import cn.wang.structural.t02_bridge.d01_device.devices.Tv;
import cn.wang.structural.t02_bridge.d01_device.remotes.AdvancedRemote;
import cn.wang.structural.t02_bridge.d01_device.remotes.BasicRemote;

/**
 * https://refactoringguru.cn/design-patterns/adapter/java/example
 */
public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("使用基本远程测试。");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("使用高级远程测试。");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
