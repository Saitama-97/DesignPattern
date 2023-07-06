package SingletonMode;

/**
 * @Time   : 2023/7/4 16:14
 * @File   : SingleObject.java
 * @Type   : Class
 * @Package: SingletonMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    : 单例模式，构造函数不开放，单独留一个函数用于返回实例
 */

public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {

    }

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World");
    }
}
