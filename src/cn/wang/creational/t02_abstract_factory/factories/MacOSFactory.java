package cn.wang.creational.t02_abstract_factory.factories;

import cn.wang.creational.t02_abstract_factory.buttons.Button;
import cn.wang.creational.t02_abstract_factory.buttons.MacOSButton;
import cn.wang.creational.t02_abstract_factory.checkboxes.Checkbox;
import cn.wang.creational.t02_abstract_factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
