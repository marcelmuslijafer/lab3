package hr.fer.oop.lab3.zadatak3;

import hr.fer.oop.lab3.zadatak1.Formation;

public class NationalTeam extends Team {

    private static final int MAX_REGISTERED_COUNT = 23;


    private String country;

    public NationalTeam(String country) {
        super(country, MAX_REGISTERED_COUNT);
        this.country = country;
    }

    public NationalTeam(String country, Formation formation) {
        super(country, MAX_REGISTERED_COUNT, formation);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
