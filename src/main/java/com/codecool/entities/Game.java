package com.codecool.entities;

public class Game {
    private HockeyTeam team1;
    private HockeyTeam team2;
    private int score1;
    private int score2;
    private String location;

    public Game(HockeyTeam team1, HockeyTeam team2, String location, int score1, int score2) {
        this.team1 = team1;
        this.team2 = team2;
        this.location = location;
        this.score1 = score1;
        this.score2 = score2;
        this.team1.addGameToHistory(this);
        this.team2.addGameToHistory(this);
    }

    public HockeyTeam getWinningTeam() {
        return getScore1() > getScore2() ? getTeam1() : getScore1() < getScore2() ? getTeam2() : null;
    }

    public boolean isDraw() {
        return getWinningTeam() == null;
    }

    public HockeyTeam getTeam1() {
        return team1;
    }

    public HockeyTeam getTeam2() {
        return team2;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    public String getLocation() {
        return location;
    }
}
