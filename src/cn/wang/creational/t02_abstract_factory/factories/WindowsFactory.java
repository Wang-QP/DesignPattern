package cn.wang.creational.t02_abstract_factory.factories;

import cn.wang.creational.t02_abstract_factory.buttons.Button;
import cn.wang.creational.t02_abstract_factory.buttons.WindowsButton;
import cn.wang.creational.t02_abstract_factory.checkboxes.Checkbox;
import cn.wang.creational.t02_abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
