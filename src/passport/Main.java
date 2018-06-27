package passport;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("user1", "user11", "");
        Person person2 = new Person("user2", "user22", "");

        Passport passport = new Passport("AE", 1);
        Passport passport1 = new Passport("AB", 2);

        Map<Passport, Person> man = new HashMap<>();

        man.put(passport1, person1);
        man.put(passport, person2);

        Person person = man.get(new Passport("AB", 2));

        System.out.println(person);

        Person person3 = man.get(new Passport("AB", 3));

        System.out.println(person3);
    }
}
