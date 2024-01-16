package com.StatsService.StatsService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team-stats")
public class StatsController {
    public ResponseEntity<TeamStats> getTeamStats(@PathVariable Long teamId) {
        // Simuler la récupération des statistiques de l'équipe pour la saison
        TeamStats teamStats = getDummyTeamStats(teamId);

        if (teamStats != null) {
            return ResponseEntity.ok(teamStats);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Méthode de simulation pour récupérer les statistiques de l'équipe pour la saison
    private TeamStats getDummyTeamStats(Long teamId) {

        return new TeamStats(teamId, "FC Barcelona", 30, 20, 5, 5);
    }
}
