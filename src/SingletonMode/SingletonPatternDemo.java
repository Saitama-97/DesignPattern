package SingletonMode;

/**
 * @Time   : 2023/7/4 16:16
 * @File   : SingletonPatternDemo.java
 * @Type   : Class
 * @Package: SingletonMode
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    :
 */

public class SingletonPatternDemo {
    public static void main(String[] args) {
        //编译时错误：构造函数 SingleObject() 是不可见的
//        SingleObject singleObject = new SingleObject();
        SingleObject singleObject = SingleObject.getInstance();

        singleObject.showMessage();
    }
}
