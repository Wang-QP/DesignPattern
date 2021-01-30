package cn.wang.structural.t02_bridge.d02_coffee;

import cn.wang.structural.t02_bridge.d02_coffee.addtitives.Milk;
import cn.wang.structural.t02_bridge.d02_coffee.coffee.LargeCoffee;
import cn.wang.structural.t02_bridge.d02_coffee.coffee.RefinedCoffee;

public class Demo {
    public static void main(String[] args) {
        //点两杯加奶的大杯咖啡
        RefinedCoffee largeWithMilk=new LargeCoffee(new Milk());
        largeWithMilk.orderCoffee(2);
        largeWithMilk.checkQuality();
    }
}
