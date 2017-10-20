package createObject.way03;

import java.io.*;

/**
 * 使用反序列化创建对象
 * 1、实现Serializable接口（一个标记可以序列化的接口）
 * 2、使用ObjectInputStream读取对象
 */
public class Serializable {
    public static void main(String[] args) {
        Person lamZe = new Person("lamZe", 18);
        System.out.println(lamZe + ":" + lamZe.hashCode());
        //序列化
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d:/Person.Obj"))) {
            out.writeObject(lamZe);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //反序列化
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("d:/Person.Obj"))) {
            Person person = (Person) in.readObject();
            System.out.println(person + ":" + person.hashCode());
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
