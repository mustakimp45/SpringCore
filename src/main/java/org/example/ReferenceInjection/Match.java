package org.example.ReferenceInjection;

public class Match {
    private Integer runs;
    private String team;
    private Players players;

    public Match(Integer runs, String team, Players players) {
        this.runs = runs;
        this.team = team;
        this.players = players;
    }

    public Match() {
    }

    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Players getPlayers() {
        return players;
    }

    public void setPlayers(Players players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Match{" +
                "runs=" + runs +
                ", team='" + team + '\'' +
                ", players=" + players +
                '}';
    }
}
