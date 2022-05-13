package jsontest;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;
import pojo.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Xugp
 * @date: 2022/2/25 16:42
 * @description:
 */
public class JsonToJavaBean {

    @Test
    public void jsonTest1() {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person(1, "xgp"));
        personArrayList.add(new Person(2, "xgp2"));
        personArrayList.add(new Person(3, "xgp3"));
        personArrayList.add(new Person(4, "xgp4"));
        Gson gson = new Gson();
        String toJson = gson.toJson(personArrayList);
        System.out.println(toJson);
        System.out.println("##################");
        List<Person> fromJson = gson.fromJson(toJson, new TypeToken<ArrayList<Person>>() {
        }.getType());
        System.out.println(fromJson);
        System.out.println("##################");
        HashMap<Integer, Person> integerPersonHashMap = new HashMap<>();
        integerPersonHashMap.put(1, new Person(1, "xgp1"));
        integerPersonHashMap.put(2, new Person(2, "xgp2"));
        integerPersonHashMap.put(3, new Person(3, "xgp3"));
        integerPersonHashMap.put(4, new Person(4, "xgp4"));
        String toJson1 = gson.toJson(integerPersonHashMap);
        System.out.println(toJson1);
        System.out.println("##################");
        Map<Integer,Person> fromJson1 = gson.fromJson(toJson1, new TypeToken<HashMap<Integer, Person>>() {
        }.getType());
        for (Map.Entry<Integer, Person> integerPersonEntry : fromJson1.entrySet()) {
            System.out.println("key:" + integerPersonEntry.getKey() + "value:" + integerPersonEntry.getValue());
        }
    }

    @Test
    public void jsonTest() {
        Person person = new Person(001, "xugp");
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
        System.out.println("##################");
        Person person1 = gson.fromJson(json, person.getClass());
        System.out.println(person1);
    }
}
