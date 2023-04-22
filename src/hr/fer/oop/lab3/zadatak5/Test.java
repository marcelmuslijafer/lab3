package hr.fer.oop.lab3.zadatak5;

import hr.fer.oop.lab3.zadatak1.Coach;
import hr.fer.oop.lab3.zadatak1.FootballPlayer;
import hr.fer.oop.lab3.zadatak1.Formation;
import hr.fer.oop.lab3.zadatak1.PlayingPosition;
import hr.fer.oop.lab3.zadatak3.ManageableTeam;
import hr.fer.oop.lab3.zadatak3.NationalTeam;
import hr.fer.oop.lab3.zadatak3.Team;
import hr.fer.oop.lab3.zadatak4.Manager;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Croatian team
        FootballPlayer livakovic = new FootballPlayer("Livaković", "Hrvatska", PlayingPosition.GK);
        FootballPlayer juranovic = new FootballPlayer("Juranović", "Hrvatska", PlayingPosition.DF);
        FootballPlayer lovren = new FootballPlayer("Lovren", "Hrvatska", PlayingPosition.DF);
        FootballPlayer gvardiol = new FootballPlayer("Gvardiol", "Hrvatska", PlayingPosition.DF);
        FootballPlayer sosa = new FootballPlayer("Sosa", "Hrvatska", PlayingPosition.DF);
        FootballPlayer modric = new FootballPlayer("Modrić", "Hrvatska", PlayingPosition.MF);
        FootballPlayer brozovic = new FootballPlayer("Brozović", "Hrvatska", PlayingPosition.MF);
        FootballPlayer kovacic = new FootballPlayer("Kovačić", "Hrvatska", PlayingPosition.MF);
        FootballPlayer pasalic = new FootballPlayer("Pašalić", "Hrvatska", PlayingPosition.MF);
        FootballPlayer kramaric = new FootballPlayer("Kramarić", "Hrvatska", PlayingPosition.MF);
        FootballPlayer perisic = new FootballPlayer("Perišić", "Hrvatska", PlayingPosition.FW);

        ManageableTeam croatia = new NationalTeam("Hrvatska");

        croatia.registerPlayer(livakovic);
        croatia.registerPlayer(juranovic);
        croatia.registerPlayer(lovren);
        croatia.registerPlayer(gvardiol);
        croatia.registerPlayer(sosa);
        croatia.registerPlayer(modric);
        croatia.registerPlayer(brozovic);
        croatia.registerPlayer(kovacic);
        croatia.registerPlayer(pasalic);
        croatia.registerPlayer(kramaric);
        croatia.registerPlayer(perisic);

        Coach dalic = new Coach("Dalić", "Hrvatska");
        dalic.setFormation(Formation.F451());
        dalic.setManagingTeam(croatia);
        dalic.forceMyFormation();
        dalic.pickStartingEleven();

        // Brazil team
        FootballPlayer alisson = new FootballPlayer("Alisson", "Brazil", PlayingPosition.GK);
        FootballPlayer militao = new FootballPlayer("Militao", "Brazil", PlayingPosition.DF);
        FootballPlayer marquinhos = new FootballPlayer("Marquinhos", "Brazil", PlayingPosition.DF);
        FootballPlayer silva = new FootballPlayer("Silva", "Brazil", PlayingPosition.DF);
        FootballPlayer danilo = new FootballPlayer("Danilo", "Brazil", PlayingPosition.DF);
        FootballPlayer coelho = new FootballPlayer("Coelho", "Brazil", PlayingPosition.MF);
        FootballPlayer casemiro = new FootballPlayer("Casemiro", "Brazil", PlayingPosition.MF);
        FootballPlayer dias = new FootballPlayer("Dias", "Brazil", PlayingPosition.MF);
        FootballPlayer neymar = new FootballPlayer("Neymar", "Brazil", PlayingPosition.MF);
        FootballPlayer vinicius = new FootballPlayer("Vinicius", "Brazil", PlayingPosition.FW);
        FootballPlayer richarlison = new FootballPlayer("Richarlison", "Brazil", PlayingPosition.FW);

        ManageableTeam brazil = new NationalTeam("Brazil");

        brazil.registerPlayer(alisson);
        brazil.registerPlayer(militao);
        brazil.registerPlayer(marquinhos);
        brazil.registerPlayer(silva);
        brazil.registerPlayer(danilo);
        brazil.registerPlayer(coelho);
        brazil.registerPlayer(casemiro);
        brazil.registerPlayer(dias);
        brazil.registerPlayer(neymar);
        brazil.registerPlayer(vinicius);
        brazil.registerPlayer(richarlison);

        Coach tite = new Coach("Tite", "Brazil");
        tite.setFormation(Formation.F442());
        tite.setManagingTeam(brazil);
        tite.forceMyFormation();
        tite.pickStartingEleven();

        System.out.println("CROATIA: ");
        System.out.println("Formation: " + croatia.getFormation());
        System.out.println("Registered: " + Arrays.toString(croatia.getStartingEleven().getPlayers()));
        System.out.println("Starting eleven: " + Arrays.toString(croatia.getStartingEleven().getPlayers()));

        System.out.println("BRAZIL: ");
        System.out.println("Formation: " + brazil.getFormation());
        System.out.println("Registered: " + Arrays.toString(brazil.getStartingEleven().getPlayers()));
        System.out.println("Starting eleven: " + Arrays.toString(brazil.getStartingEleven().getPlayers()));

        brazil.setFormation(Formation.F352());
        tite.pickStartingEleven();
    }
}