package cn.wang.d02_test;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("错误控制台::Logger: " + message);
    }
}
