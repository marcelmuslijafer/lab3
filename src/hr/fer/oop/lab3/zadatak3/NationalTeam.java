package hr.fer.oop.lab3.zadatak3;

import hr.fer.oop.lab3.zadatak1.FootballPlayer;
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
     *
     * Coefficient that is multiplied with players' skill when
     * calculating the national team's rating.
     *
     */
    private static final double RATING_SKILL_COEFFICIENT = 0.3;


    /**
     * Coefficient that is multiplied with players' emotion when
     * calculating the national team's rating.
     */
    private static final double RATING_EMOTION_COEFFICIENT = 0.7;

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

    @Override
    public boolean registerPlayer(FootballPlayer player) {
        if (!country.equals(player.getCountry()))
            return false;

        return registeredPlayers.add(player);
    }

    @Override
    public double getSkillCoefficient() {
        return RATING_SKILL_COEFFICIENT;
    }

    @Override
    public double getEmotionCoefficient() {
        return RATING_EMOTION_COEFFICIENT;
    }

    /**
     * @return the national team's country
     */
    public String getCountry() {
        return country;
    }
}
