package cn.wang.creational.t02_abstract_factory;

import cn.wang.creational.t02_abstract_factory.app.Application;
import cn.wang.creational.t02_abstract_factory.factories.GUIFactory;
import cn.wang.creational.t02_abstract_factory.factories.MacOSFactory;
import cn.wang.creational.t02_abstract_factory.factories.WindowsFactory;

public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
