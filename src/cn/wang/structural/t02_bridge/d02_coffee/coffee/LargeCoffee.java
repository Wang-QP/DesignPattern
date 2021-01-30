package cn.wang.structural.t02_bridge.d02_coffee.coffee;

import cn.wang.structural.t02_bridge.d02_coffee.addtitives.ICoffeeAdditives;

public class LargeCoffee extends RefinedCoffee {

    public LargeCoffee(ICoffeeAdditives additives) {
        super(additives);
    }

    @Override
    public void orderCoffee(int count) {
        additives.addSomething();
        System.out.println("大杯咖啡" + count + "杯");
    }
}
