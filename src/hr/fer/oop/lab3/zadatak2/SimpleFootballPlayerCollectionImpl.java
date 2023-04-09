package hr.fer.oop.lab3.zadatak2;

import hr.fer.oop.lab3.zadatak1.FootballPlayer;

import java.util.Arrays;

public class SimpleFootballPlayerCollectionImpl implements SimpleFootballPlayerCollection {

    /**
     * Stores the players.
     */
    private FootballPlayer[] players;

    /**
     * Number of players in the collection.
     */
    private int size;

    /**
     * Constructs the collection with the specified capacity.
     * @param capacity
     */
    public SimpleFootballPlayerCollectionImpl(int capacity) {
        players = new FootballPlayer[capacity];
        size = 0;
    }

    @Override
    public boolean add(FootballPlayer player) {
        if (player == null)
            return false;

        if (size >= players.length)
            return false;

        if (contains(player))
            return false;

        players[size++] = player;
        return true;
    }

    @Override
    public int calculateEmotionSum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += players[i].getEmotion();
        }
        return sum;
    }

    @Override
    public int calculateSkillSum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += players[i].getPlayingSkill();
        }
        return sum;
    }

    @Override
    public void clear() {
        Arrays.fill(players, null);
        size = 0;
    }

    @Override
    public boolean contains(FootballPlayer player) {
        for (int i = 0; i < size; i++) {
            if (players[i].equals(player)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getMaxSize() {
        return players.length;
    }

    @Override
    public FootballPlayer[] getPlayers() {
        return players;
    }

    @Override
    public int size() {
        return size;
    }
}
