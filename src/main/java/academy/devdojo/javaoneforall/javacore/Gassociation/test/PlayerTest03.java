package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Player;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player = new Player("Pelé");
        Player player2 = new Player("Cafu");
        Team team = new Team("Brazil");
        Player[] players = {player, player2};

        player.setTeam(team);
        player2.setTeam(team);
        team.setPlayers(players);


        System.out.println("--- Player ---");
        player.print();
        System.out.println("--- Team ---");
        team.print();
    }
}
