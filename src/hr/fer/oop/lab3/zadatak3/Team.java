package hr.fer.oop.lab3.zadatak3;

import hr.fer.oop.lab3.zadatak1.Formation;
import hr.fer.oop.lab3.zadatak2.SimpleFootballPlayerCollection;
import hr.fer.oop.lab3.zadatak2.SimpleFootballPlayerCollectionImpl;

public abstract class Team {

    private final String name;

    private Formation formation;

    private SimpleFootballPlayerCollection registeredPlayers;

    private SimpleFootballPlayerCollection startingEleven;

    public Team(String name, int numberOfRegisteredPlayers) {
        this.name = name;
        formation = Formation.F442();
        registeredPlayers = new SimpleFootballPlayerCollectionImpl(numberOfRegisteredPlayers);
        startingEleven = new SimpleFootballPlayerCollectionImpl(11);
    }

    public Team(String name, int numberOfRegisteredPlayers, Formation formation) {
        this(name, numberOfRegisteredPlayers);
        this.formation = formation;
    }
}
