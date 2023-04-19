package hr.fer.oop.lab3.zadatak3;

import hr.fer.oop.lab3.zadatak1.Formation;

/**
 * Class that describes a football club.
 */
public class ClubTeam extends Team {

    /**
     * A football club can't have more than 25 players registered.
     */
    private static final int REGISTERED_CAPACITY = 25;

    /**
     * Football club's reputation.
     */
    private int reputation;

    /**
     * Constructs a football club with the specified name.
     * Reputation and formation are set to default (50, 4-4-2).
     * @param name club's name
     */
    public ClubTeam(String name) {
        super(name, REGISTERED_CAPACITY);
        this.reputation = 50;
    }

    /**
     * Constructs a football club with the specified name and reputation.
     * Formation is set to default (4-4-2).
     * @param name club's name
     * @param reputation club's reputation
     */
    public ClubTeam(String name, int reputation) {
        super(name, REGISTERED_CAPACITY);
        this.reputation = reputation;
    }

    /**
     * Constructs a football club with the specified name, reputation and formation.
     * @param name team's name
     * @param reputation team's reputation
     * @param formation team's formation
     */
    public ClubTeam(String name, int reputation, Formation formation) {
        super(name, REGISTERED_CAPACITY, formation);
        this.reputation = reputation;
    }

    /**
     * @return club's reputation
     */
    public int getReputation() {
        return reputation;
    }

    /**
     * Sets the club's reputation.
     * @param reputation reputation value, must be in [0, 100]
     */
    public void setReputation(int reputation) {
        if (reputation < 0 || reputation > 100) {
            System.out.println("Cannot set reputation to: " + reputation);
            return;
        }
        this.reputation = reputation;
    }
}
