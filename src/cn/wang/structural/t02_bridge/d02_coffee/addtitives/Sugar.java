package cn.wang.structural.t02_bridge.d02_coffee.addtitives;


//加糖
public class Sugar implements ICoffeeAdditives {
    @Override
    public void addSomething() {
        System.out.println("加糖");
    }
}
