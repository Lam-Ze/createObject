package createObject.way05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/**
 * 使用Constructor的newInstance创建对象
 */
public class Const {
    public static void main(String[] args) {
        Class<Person> clzz = Person.class;
        try {
            Constructor<Person> constructor = clzz.getConstructor(String.class, int.class);
            try {
                Person person = constructor.newInstance("lamZe", 18);
                System.out.println(person);
            } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
