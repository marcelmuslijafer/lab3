package hr.fer.oop.lab3.zadatak2;

import hr.fer.oop.lab3.zadatak1.FootballPlayer;

/**
 * A simple data structure that stores football players.
 */
public interface SimpleFootballPlayerCollection {

    /**
     * Adds a player to the collection.
     * @param player the player to add
     * @return true if the player is not already present and the collection is not full, false otherwise
     */
    boolean add(FootballPlayer player);

    /**
     * @return the emotion sum of all players in the collection
     */
    int calculateEmotionSum();

    /**
     * @return the playing skill sum of all the players in the collection
     */
    int calculateSkillSum();

    /**
     * Removes all players from the collection.
     */
    void clear();

    /**
     * Checks if the specified player is in the collection.
     * @param player the player to search for
     * @return true if the player is found, false otherwise
     */
    boolean contains(FootballPlayer player);

    /**
     * @return the maximum number of players that can be stored in the collection
     */
    int getMaxSize();

    /**
     * @return the FootballPlayer array object in which the players are stored internally
     */
    FootballPlayer[] getPlayers();

    /**
     * @return the number of players stored in the collection
     */
    int size();
}
