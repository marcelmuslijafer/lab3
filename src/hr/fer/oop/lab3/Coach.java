package hr.fer.oop.lab3;

public class Coach extends Person {

    private int coachingSkill;

    private Formation formation;

    public Coach(String name, String country) {
        super(name, country);
        coachingSkill = 50;
        formation = Formation.F442();
    }

    public Coach(String name, String country, int emotion, int coachingSkill, Formation formation) {
        super(name, country, emotion);
        this.coachingSkill = 50;
        setCoachingSkill(coachingSkill);
        this.formation = formation;
    }

    public int getCoachingSkill() {
        return coachingSkill;
    }

    public void setCoachingSkill(int coachingSkill) {
        if (coachingSkill < 0 || coachingSkill > 100) {
            System.out.println("Cannot set coachingSkill to: " + coachingSkill);
            return;
        }
        this.coachingSkill = coachingSkill;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }
}
