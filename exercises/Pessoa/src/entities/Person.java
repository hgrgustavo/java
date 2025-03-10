package entities;

import java.util.List;

public class Person {
    private int age;
    private String name;

    // Getters & Setters
    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Constructors
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Methods
    public static boolean existName(List<Person> list, String name ) { return list.stream().allMatch(x -> name.equals(x.getName())); }
    public static void whoIsOlder(List<Person> list, int age) {
        int i = 0;
        for(Person p : list) {
            if(age > p.getAge()) {
                age = p.getAge();
                i++;
            }
        }
    }
    public String toString() { return "\n> Older person: " + getName(); }

}