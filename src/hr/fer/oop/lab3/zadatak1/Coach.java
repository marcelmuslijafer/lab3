package hr.fer.oop.lab3.zadatak1;

/**
 * Class that describes a Coach.
 */
public class Coach extends Person {

    /**
     * Coach's skill. Values must be in the range [0, 100].
     */
    private int coachingSkill;

    /**
     * Coach's favorite formation to play.
     */
    private Formation formation;

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
            System.out.println("Cannot set coachingSkill to: " + coachingSkill);
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
