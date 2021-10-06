package com.codecool.entities;

import java.util.ArrayList;
import java.util.List;

public class HockeyLeague {
    private List<HockeyTeam> hockeyTeams;

    public HockeyLeague(List<HockeyTeam> hockeyTeams) {
        if (hockeyTeams.size() < 4) {
            throw new IllegalArgumentException("Not enough teams");
        }
        this.hockeyTeams = hockeyTeams;

    }

    public List<HockeyTeam> findTeamsWithSameCoach(Coach coach) {
        List<HockeyTeam> teams = new ArrayList<>();
        for (HockeyTeam team : hockeyTeams) {
            Coach currentCoach = team.getCoach();
            if (currentCoach == coach) {
                teams.add(team);
            }
        }

        return teams;
    }

    public HockeyTeam getTeamWithMostWins() {
        int currentMostWins = 0;
        HockeyTeam currentTeam = null;
        for (HockeyTeam team : hockeyTeams) {
            if (team.getWins() > currentMostWins){
                currentTeam = team;
                currentMostWins = team.getWins();
            }
        }
        return currentTeam;
    }

    public void printWinsForEachTeam() {
        for (HockeyTeam team : hockeyTeams) {
            System.out.printf("Team's %s wins: %d\n", team.getName(), team.getWins());
        }
    }
}
