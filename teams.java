import java.util.ArrayList;
import java.util.List;

public class Team {
    private TeamType teamType;
    private List<Player> players;

    public Team(TeamType teamType) {
        this.teamType = teamType;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        if (players.size() < 15) {
            players.add(player);
            player.setTeam(this);
        } else {
            throw new RuntimeException("Team already has maximum number of players");
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public TeamType getTeamType() {
        return teamType;
    }
}

enum TeamType {
    TEAM_A,
    TEAM_B
}

public class Player {
    private String name;
    private Team team;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }
}
