package cn.wang.structural.t02_bridge.d02_coffee.addtitives;

//加奶
public class Milk implements ICoffeeAdditives {
    @Override
    public void addSomething() {
        System.out.println("加奶");
    }
}
