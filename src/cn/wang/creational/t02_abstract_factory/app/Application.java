package cn.wang.creational.t02_abstract_factory.app;

import cn.wang.creational.t02_abstract_factory.buttons.Button;
import cn.wang.creational.t02_abstract_factory.checkboxes.Checkbox;
import cn.wang.creational.t02_abstract_factory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
