package hr.fer.oop.lab3.zadatak3;

import hr.fer.oop.lab3.zadatak1.Formation;
import hr.fer.oop.lab3.zadatak2.SimpleFootballPlayerCollection;
import hr.fer.oop.lab3.zadatak2.SimpleFootballPlayerCollectionImpl;

/**
 * An abstract class that describes a Team.
 * Contains methods and fields common for all types of teams.
 */
public abstract class Team {

    /**
     * Name of the team
     */
    private final String name;

    /**
     * Team's formation on the pitch.
     */
    private Formation formation;

    /**
     * A collection of players registered in the team.
     */
    private SimpleFootballPlayerCollection registeredPlayers;

    /**
     * The team's starting eleven.
     */
    private SimpleFootballPlayerCollection startingEleven;

    /**
     * Constructs a team with the specified name and number of registered players.
     * The formation is set to default (4-4-2).
     * @param name name of the team
     * @param numberOfRegisteredPlayers number of registered players
     */
    public Team(String name, int numberOfRegisteredPlayers) {
        this.name = name;
        formation = Formation.F442();
        registeredPlayers = new SimpleFootballPlayerCollectionImpl(numberOfRegisteredPlayers);
        startingEleven = new SimpleFootballPlayerCollectionImpl(11);
    }

    /**
     * Constructs a team with the specified name, number of registered players and formation.
     * @param name name of the team
     * @param numberOfRegisteredPlayers number of registered players
     * @param formation team's formation on the pitch
     */
    public Team(String name, int numberOfRegisteredPlayers, Formation formation) {
        this(name, numberOfRegisteredPlayers);
        this.formation = formation;
    }
}
