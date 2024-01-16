package com.teamservice.teamservice.controller;// TeamController.java

import ch.qos.logback.core.BasicStatusManager;
import ch.qos.logback.core.status.Status;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @GetMapping("/{id}")
    public ResponseEntity<Team> getTeamDetails(@PathVariable Long id) {

        Team team = Team.getTeamById(id);

        if (team != null) {
            return ResponseEntity.ok(team);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<String> createTeam(@RequestBody Team newTeam) {
        // Ajouter la nouvelle équipe à la liste statique
        BasicStatusManager teamList = null;
        teamList.add((Status) newTeam);


        return new ResponseEntity<>("Nouvelle équipe ajoutée avec succès", HttpStatus.CREATED);
    }
}

