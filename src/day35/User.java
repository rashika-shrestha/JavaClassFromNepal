package day35;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }

    public static void main(String[] args) {
        User u = new User("ram", 22);
        System.out.println(u);

        List<User> ul = new ArrayList<>();
        ul.add(new User("shyam", 11));
        ul.add(new User("hari", 12));
        ul.add(new User("raju", 14));
        System.out.println(ul);
    }
}
