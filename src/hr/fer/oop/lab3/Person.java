package hr.fer.oop.lab3;

import java.util.Objects;

public abstract class Person {

    private final String name;

    private final String country;

    private int emotion;

    public Person(String name, String country) {
        this.name = name;
        this.country = country;
        emotion = 50;
    }

    public Person(String name, String country, int emotion) {
        this(name, country);
        setEmotion(emotion);
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getEmotion() {
        return emotion;
    }

    public void setEmotion(int emotion) {
        if (emotion < 0 || emotion > 100) {
            System.out.println("Cannot set emotion to value: " + emotion);
            return;
        }
        this.emotion = emotion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(country, person.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }
}
