package cn.wang.creational.t02_abstract_factory.factories;

import cn.wang.creational.t02_abstract_factory.buttons.Button;
import cn.wang.creational.t02_abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
