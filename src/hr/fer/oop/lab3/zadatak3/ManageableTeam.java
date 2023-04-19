package hr.fer.oop.lab3.zadatak3;

import hr.fer.oop.lab3.zadatak1.FootballPlayer;
import hr.fer.oop.lab3.zadatak1.Formation;
import hr.fer.oop.lab3.zadatak2.SimpleFootballPlayerCollection;

/**
 * A team can be managed if it implements this interface.
 */
public interface ManageableTeam {

    /**
     * Adds a player to the starting eleven if there is room and if the player is registered.
     * @param player player to add to the starting eleven
     * @return true if the player is added, false otherwise
     */
    boolean addPlayerToStartingEleven(FootballPlayer player);

    /**
     * Calculates the team's rating.
     * @return the team's rating
     */
    double calculateRating();

    /**
     * Removes all players from the starting eleven.
     */
    void clearStartingEleven();

    /**
     * @return the team's formation
     */
    Formation getFormation();

    /**
     * @return team's registered players
     */
    SimpleFootballPlayerCollection getRegisteredPlayers();

    /**
     * @return team's starting eleven
     */
    SimpleFootballPlayerCollection getStartingEleven();

    /**
     * Checks if the player is registered.
     * @param player player to check
     * @return true if player is registered, false otherwise
     */
    boolean isPlayerRegistered(FootballPlayer player);

    /**
     * Registers a player if there is room in the collection of registered players.
     * @param player player to register
     * @return true if the player is registered successfully, false otherwise
     */
    boolean registerPlayer(FootballPlayer player);

    /**
     * Sets the team's formation if it is not null.
     * @param formation the team's formation
     */
    void setFormation(Formation formation);
}
