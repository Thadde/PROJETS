package com.StatsService.StatsService.controller;

public class TeamStats {

    private Long teamId;
    private String teamName;
    private int matchesPlayed;
    private int wins;
    private int draws;
    private int losses;

    // Constructeur par défaut (nécessaire pour la désérialisation JSON par exemple)
    public TeamStats() {
    }

    // Constructeur avec paramètres
    public TeamStats(Long teamId, String teamName, int matchesPlayed, int wins, int draws, int losses) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
    }

    // Getters et setters (nécessaires pour la sérialisation/désérialisation JSON)
    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    @Override
    public String toString() {
        return "TeamStats{" +
                "teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                ", matchesPlayed=" + matchesPlayed +
                ", wins=" + wins +
                ", draws=" + draws +
                ", losses=" + losses +
                '}';
    }
}
