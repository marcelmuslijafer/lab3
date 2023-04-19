package hr.fer.oop.lab3.zadatak1;

import hr.fer.oop.lab3.zadatak2.SimpleFootballPlayerCollection;
import hr.fer.oop.lab3.zadatak2.SimpleFootballPlayerCollectionImpl;
import hr.fer.oop.lab3.zadatak3.ManageableTeam;
import hr.fer.oop.lab3.zadatak4.Manager;

/**
 * Class that describes a coach.
 */
public class Coach extends Person implements Manager {

    /**
     * Coach's skill. Values must be in the range [0, 100].
     */
    private int coachingSkill;

    /**
     * Coach's favorite formation to play.
     */
    private Formation formation;

    /**
     * The coach's team.
     */
    private ManageableTeam managingTeam;

    /**
     * Constructs a coach with the specified name and country.
     * emotion, coachingSkill and formation are default. (50, 50, F442)
     * @param name coach's name
     * @param country coach's country
     */
    public Coach(String name, String country) {
        super(name, country);
        coachingSkill = 50;
        formation = Formation.F442();
    }

    /**
     * Constructs a coach with the specified name, country, emotion, coachingSkill and formation.
     * @param name coach's name
     * @param country coach's country
     * @param emotion coach's emotion
     * @param coachingSkill coach's skill
     * @param formation coach's favorite formation
     */
    public Coach(String name, String country, int emotion, int coachingSkill, Formation formation) {
        super(name, country, emotion);
        this.coachingSkill = 50;
        setCoachingSkill(coachingSkill);
        this.formation = formation;
    }

    @Override
    public void forceMyFormation() {
        managingTeam.setFormation(formation);
    }

    @Override
    public void pickStartingEleven() {
        int registeredPlayersCount = managingTeam.getRegisteredPlayers().size();
        FootballPlayer[] players = managingTeam.getRegisteredPlayers().getPlayers();
        Formation teamFormation = managingTeam.getFormation();

        SimpleFootballPlayerCollection goalkeepers = new SimpleFootballPlayerCollectionImpl(1);
        SimpleFootballPlayerCollection defenders = new SimpleFootballPlayerCollectionImpl(teamFormation.getDf());
        SimpleFootballPlayerCollection midfielders = new SimpleFootballPlayerCollectionImpl(teamFormation.getMf());
        SimpleFootballPlayerCollection forwards = new SimpleFootballPlayerCollectionImpl(teamFormation.getFw());

        for (int i = 0; i < registeredPlayersCount; i++) {
            FootballPlayer player = players[i];
            switch (player.getPlayingPosition()) {
                case GK -> goalkeepers.add(player);
                case DF -> defenders.add(player);
                case MF -> midfielders.add(player);
                case FW -> forwards.add(player);
            }
        }

        String format = "Not enough %s in the team to play " + teamFormation + ".";
        if (goalkeepers.size() < goalkeepers.getMaxSize()) {
            System.out.printf(format, "goalkeepers");
            return;
        }
        if (defenders.size() < defenders.getMaxSize()) {
            System.out.printf(format, "defenders");
            return;
        }
        if (midfielders.size() < midfielders.getMaxSize()) {
            System.out.printf(format, "midfielders");
            return;
        }
        if (forwards.size() < forwards.getMaxSize()) {
            System.out.printf(format, "forwards");
            return;
        }

        managingTeam.getStartingEleven().clear();
        for (FootballPlayer goalkeeper : goalkeepers.getPlayers()) {
            managingTeam.addPlayerToStartingEleven(goalkeeper);
        }
        for (FootballPlayer defender : defenders.getPlayers()) {
            managingTeam.addPlayerToStartingEleven(defender);
        }
        for (FootballPlayer midfielder : midfielders.getPlayers()) {
            managingTeam.addPlayerToStartingEleven(midfielder);
        }
        for (FootballPlayer forward : forwards.getPlayers()) {
            managingTeam.addPlayerToStartingEleven(forward);
        }
    }

    @Override
    public void setManagingTeam(ManageableTeam team) {
        if (team == null)
            return;

        managingTeam = team;
    }

    /**
     * @return coach's skill
     */
    public int getCoachingSkill() {
        return coachingSkill;
    }

    /**
     * Sets the coach's skill.
     * @param coachingSkill skill value, must be in [0, 100]
     */
    public void setCoachingSkill(int coachingSkill) {
        if (coachingSkill < 0 || coachingSkill > 100) {
            System.out.println("Cannot set coaching skill to: " + coachingSkill);
            return;
        }
        this.coachingSkill = coachingSkill;
    }

    /**
     * @return coach's favorite formation
     */
    public Formation getFormation() {
        return formation;
    }

    /**
     * Sets the coach's favorite formation.
     * @param formation the coach's favorite formation
     */
    public void setFormation(Formation formation) {
        this.formation = formation;
    }
}
