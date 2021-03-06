package cn.wang.behavioral.t02_test;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("文件::Logger: " + message);
    }
}