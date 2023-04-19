package hr.fer.oop.lab3.zadatak3;

import hr.fer.oop.lab3.zadatak1.Formation;

/**
 * Class that describes a football national team.
 */
public class NationalTeam extends Team {

    /**
     * National teams can't have more than 23 players registered.
     */
    private static final int REGISTERED_CAPACITY = 23;

    /**
     * National team's country.
     */
    private String country;

    /**
     * Constructs a national team with the specified country.
     * The name of the national team is set to country.
     * Formation is set to default (4-4-2).
     * @param country national team's country.
     */
    public NationalTeam(String country) {
        super(country, REGISTERED_CAPACITY);
        this.country = country;
    }

    /**
     * Constructs a national team with the specified country and formation.
     * The name of the national team is set to country.
     * @param country national team's country
     * @param formation national team's formation
     */
    public NationalTeam(String country, Formation formation) {
        super(country, REGISTERED_CAPACITY, formation);
        this.country = country;
    }

    /**
     * @return the national team's country
     */
    public String getCountry() {
        return country;
    }
}
