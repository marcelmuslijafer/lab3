package hr.fer.oop.lab3;

public class FootballPlayer extends Person {

    private int playingSkill;

    private PlayingPosition playingPosition;

    public FootballPlayer(String name, String country, PlayingPosition playingPosition) {
        super(name, country);
        this.playingSkill = 50;
        this.playingPosition = playingPosition;
    }

    public FootballPlayer(String name, String country, PlayingPosition playingPosition, int emotion, int playingSkill) {
        super(name, country, emotion);
        this.playingSkill = 50;
        setPlayingSkill(playingSkill);
        this.playingPosition = playingPosition;
    }

    public int getPlayingSkill() {
        return playingSkill;
    }

    public void setPlayingSkill(int playingSkill) {
        if (playingSkill < 0 || playingSkill > 100) {
            System.out.println("Cannot set playingSkill to: " + playingSkill);
            return;
        }
        this.playingSkill = playingSkill;
    }

    public PlayingPosition getPlayingPosition() {
        return playingPosition;
    }

    public void setPlayingPosition(PlayingPosition playingPosition) {
        this.playingPosition = playingPosition;
    }
}
