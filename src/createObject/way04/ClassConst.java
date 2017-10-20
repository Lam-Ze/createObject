package createObject.way04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 使用Class的newInstance方法
 * 注意：只能调用 类的无参构造器
 */
public class ClassConst {
    public static void main(String[] args) {
        Class<Person> clazz = Person.class;
        try {
            Person person = clazz.newInstance();
            System.out.println(person);
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
