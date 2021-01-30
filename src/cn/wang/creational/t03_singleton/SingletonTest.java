package cn.wang.creational.t03_singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton06 s = Singleton06.INSTANCE;
        s.whateverMethod();
    }
}
