package multipledatasources.xuliehua2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangmingyu on 2019/1/14.
 */
public class DemoAtomic {
    public static void main(String [] args) throws IOException, ClassNotFoundException {
//        Jedis jedis = new Jedis("localhost",6379);
//        jedis.setex("test1", 60*60*24,SerializeUtils.serialize(new Person(1, "测试1", 21,"男")));
//        jedis.setex("Query_Ve_Record_3", 60*60*24,SerializeUtils.serialize(new Person(2, "测试2", 21,"女")));
//        jedis.setex("test3", 60*60*24,SerializeUtils.serialize(new Person(3, "测试3", 21,"男")));
//        jedis.setex("test4", 60*60*24,SerializeUtils.serialize(new Person(4, "测试4", 21,"女")));
//        Set<String> keys = jedis.keys("*");
        List<Person>list=new ArrayList<Person>();
        Person person1=new Person(1, "测试1", 21,"男");
        list.add(person1);
        Person person2=new Person(2, "测试2", 21,"男");
        list.add(person2);
        Person person3=new Person(3, "测试3", 21,"男");
        list.add(person3);
        for (Person s:list) {
       //     System.out.println(UUID.randomUUID().toString());
            String  serialStr=SerializeUtils.serialize(s);
            System.out.println(serialStr);
            Person person = (Person)SerializeUtils.serializeToObject(serialStr);
            System.out.println(person.toString());
        }
    }
}

