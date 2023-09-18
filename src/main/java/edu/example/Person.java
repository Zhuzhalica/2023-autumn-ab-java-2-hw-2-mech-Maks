package edu.example;

import java.util.Objects;

public class Person {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash *= 31 * age.hashCode();
        hash *= 31 * name.hashCode();

        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;

        Person p = (Person) o;

        return Objects.equals(p.age, this.age)
                && Objects.equals(p.name, this.name);
    }

    @Override
    public String toString() {
        return this.age + " ; " + this.name;
    }
}
