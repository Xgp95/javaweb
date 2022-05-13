package pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author: Xugp
 * @date: 2022/1/15 17:03
 * @description:
 */
public class Person {
    private String name;
    private String[] phone;
    private List<String> citys;
    private Map<String,Object> map;
    private Integer age;

    public Person() {
    }

    public Person(String name, String[] phone, List<String> citys, Map<String, Object> map, Integer age) {
        this.name = name;
        this.phone = phone;
        this.citys = citys;
        this.map = map;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhone() {
        return phone;
    }

    public void setPhone(String[] phone) {
        this.phone = phone;
    }

    public List<String> getCitys() {
        return citys;
    }

    public void setCitys(List<String> citys) {
        this.citys = citys;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone=" + Arrays.toString(phone) +
                ", citys=" + citys +
                ", map=" + map +
                ", age=" + age +
                '}';
    }
}
