package cn.wang.creational.t02_abstract_factory.checkboxes;

public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
