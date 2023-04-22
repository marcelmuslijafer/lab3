package hr.fer.oop.lab3.zadatak1;

/**
 * Class that describes a FootballPlayer
 */
public class FootballPlayer extends Person {

    /**
     * Player's skill. Values must be in the range [0, 100].
     */
    private int playingSkill;

    /**
     * Player's position on the football pitch.
     */
    private PlayingPosition playingPosition;

    /**
     * Constructs a football player with the specified name, country and playing position.
     * emotion and playingSkill are set to default values. (50, 50)
     * @param name player's name
     * @param country player's country
     * @param playingPosition player's position on the pitch
     */
    public FootballPlayer(String name, String country, PlayingPosition playingPosition) {
        super(name, country);
        this.playingSkill = 50;
        this.playingPosition = playingPosition;
    }

    /**
     * Constructs a football player with the specified name, country, playing position, emotion and playing skill.
     * @param name player's name
     * @param country player's country
     * @param playingPosition player's position on the pitch
     * @param emotion player's emotion
     * @param playingSkill player's skill
     */
    public FootballPlayer(String name, String country, PlayingPosition playingPosition, int emotion, int playingSkill) {
        super(name, country, emotion);
        this.playingSkill = 50;
        setPlayingSkill(playingSkill);
        this.playingPosition = playingPosition;
    }

    /**
     * @return player's skill
     */
    public int getPlayingSkill() {
        return playingSkill;
    }

    /**
     * Sets the player's skill.
     * @param playingSkill player's skill
     * @throws IllegalArgumentException if playing skill is not in [0, 100]
     */
    public void setPlayingSkill(int playingSkill) {
        if (playingSkill < 0 || playingSkill > 100) {
            throw new IllegalArgumentException("Cannot set playing skill to: " + playingSkill);
        }
        this.playingSkill = playingSkill;
    }

    /**
     * @return player's position on the pitch
     */
    public PlayingPosition getPlayingPosition() {
        return playingPosition;
    }

    /**
     * Sets the player's position on the pitch.
     * @param playingPosition player's position on the pitch
     */
    public void setPlayingPosition(PlayingPosition playingPosition) {
        this.playingPosition = playingPosition;
    }
}
