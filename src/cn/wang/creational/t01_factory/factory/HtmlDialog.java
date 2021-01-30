package cn.wang.creational.t01_factory.factory;


import cn.wang.creational.t01_factory.buttons.Button;
import cn.wang.creational.t01_factory.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}