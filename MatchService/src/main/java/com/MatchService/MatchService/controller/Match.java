package com.MatchService.MatchService.controller;

import java.util.ArrayList;
import java.util.List;

public class Match {
    private Long id;
    private String team1;
    private String team2;
    private String result;
    private static List<Match> matchList = new ArrayList<>();




    // Méthode pour mettre à jour les informations d'un match existant
    public static Match updateMatch(Long id, String team1, String team2, String result) {
        // Recherchez le match dans la liste par son identifiant
        Match existingMatch = matchList.stream()
                .filter(match -> match.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (existingMatch != null) {
            // Mettez à jour les informations du match
            existingMatch.setTeam1(team1);
            existingMatch.setTeam2(team2);
            existingMatch.setResult(result);
        }

        return existingMatch;
    }

    private void setResult(String result) {
    }

    private void setTeam2(String team2) {
    }

    private void setTeam1(String team1) {
    }

    private Object getId() {
        return null;
    }

    // Méthode pour supprimer un match par son identifiant
    public static void deleteMatch(Long id) {
        matchList.removeIf(match -> match.getId().equals(id));
    }
    public void addMatchDetails(Long id, String team1, String team2, String result) {
        this.id = id;
        this.team1 = team1;
        this.team2 = team2;
        this.result = result;

    }


    public static Match getMatchById(Long id) {

        Match match = new Match();
        match.addMatchDetails(id, "TeamA", "TeamB", "2-1");

        return match;
    }
}
