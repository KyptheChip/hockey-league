package com.codecool.entities;

import java.util.List;

public class HockeyTeam {
    private String name;
    private Coach coach;
    private int wins;
    private List<Game> gamesHistory;
    private List<Player> players;

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public HockeyTeam(String name, List<Player> players) {
        this.name = name;
        if (players.size() < 6) {
            throw new IllegalArgumentException("Not enough players");
        }
        for (int i = 0; i < 6; i++) {
            this.players.add(players.get(i));
        }
        this.wins = 0;

    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Coach getCoach() {
        return coach;
    }

    public String getName() {
        return name;
    }

    public List<Game> getGamesHistory() {
        return gamesHistory;
    }

    public void addGameToHistory(Game game) {
        gamesHistory.add(game);
    }
}
