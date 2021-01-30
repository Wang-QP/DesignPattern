package cn.wang.structural.t02_bridge.d01_device.remotes;

import cn.wang.structural.t02_bridge.d01_device.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
