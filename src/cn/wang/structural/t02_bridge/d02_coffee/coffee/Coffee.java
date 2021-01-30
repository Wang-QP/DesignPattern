package cn.wang.structural.t02_bridge.d02_coffee.coffee;

import cn.wang.structural.t02_bridge.d02_coffee.addtitives.ICoffeeAdditives;

//抽象化Abstraction
public abstract class Coffee {
    protected ICoffeeAdditives additives;
    public Coffee(ICoffeeAdditives additives){
        this.additives=additives;
    }
    public abstract void orderCoffee(int count);
}
