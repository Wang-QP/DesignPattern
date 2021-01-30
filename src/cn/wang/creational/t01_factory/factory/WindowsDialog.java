package cn.wang.creational.t01_factory.factory;

import cn.wang.creational.t01_factory.buttons.Button;
import cn.wang.creational.t01_factory.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
