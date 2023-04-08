package hr.fer.oop.lab3;

import java.util.Objects;

/**
 * Class that describes a person.
 */
public abstract class Person {

    /**
     *  Name of the person.
     *  Once initialized, it cannot be changed. (final; no setters)
     */
    private final String name;

    /**
     * Person's country.
     * Once initialized, it cannot be changed. (final; no setters)
     */
    private final String country;

    /**
     * Persons' emotion. Values must be in range [0, 100].
     * Default value is 50.
     */
    private int emotion;

    /**
     * Constructs a person object with the specified name and country, and default emotion value.
     * @param name person's name
     * @param country person's country
     */
    public Person(String name, String country) {
        this.name = name;
        this.country = country;
        emotion = 50;
    }

    /**
     * Constructs a person object with the specified name, country and emotion value.
     * @param name person's name
     * @param country person's country
     * @param emotion person's emotion
     */
    public Person(String name, String country, int emotion) {
        this(name, country);
        setEmotion(emotion);
    }

    /**
     * @return person's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return person's country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @return person's emotion
     */
    public int getEmotion() {
        return emotion;
    }

    /**
     * Sets the person's emotion
     * @param emotion emotion value, must be in [0, 100]
     */
    public void setEmotion(int emotion) {
        if (emotion < 0 || emotion > 100) {
            System.out.println("Cannot set emotion to value: " + emotion);
            return;
        }
        this.emotion = emotion;
    }

    /**
     * Two persons are equal if they have the same name and country.
     * This method was generated with IntelliJ.
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(country, person.country);
    }

    /**
     * Calculate hash from name and country fields.
     * This method was generated with IntelliJ.
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }
}
