package createObject.way02;

/**
 * 使用clone方法创建对象
 * 步骤：
 * 1、要创建的对象的类实现Cloneable接口
 * 2、重写clone方法
 */
public class Clone {
    public static void main(String[] args) {

        Person lamze = new Person("lamze", 18);
        Person lamze2 = (Person) lamze.clone();
        System.out.println(lamze + ":" + lamze.hashCode());
        System.out.println(lamze2 + ":" + lamze2.hashCode());
    }
}
