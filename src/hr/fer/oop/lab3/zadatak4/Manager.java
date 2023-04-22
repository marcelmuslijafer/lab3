package hr.fer.oop.lab3.zadatak4;

import hr.fer.oop.lab3.zadatak3.ManageableTeam;

/**
 * A coach knows how to manage a team if he implements this interface.
 */
public interface Manager {

    /**
     * Sets the team's formation to the coach's favorite.
     */
    void forceMyFormation();

    /**
     * Selects the starting eleven. All the selected players must be able
     * to play in the team's formation. For example, if the formation
     * is 4-4-2, the starting eleven must have a goalkeeper, 4 defenders,
     * 4 midfielders and 2 attackers.
     * @throws NotEnoughPlayersForPositionException if there is not enough players for all the positions
     */
    void pickStartingEleven() throws NotEnoughPlayersForPositionException;

    /**
     * Sets the manager's team.
     * @param team the team to be managed
     */
    void setManagingTeam(ManageableTeam team);
}
