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

        BasicStatusManager teamList = null;
        teamList.add((Status) newTeam);


        return new ResponseEntity<>("Nouvelle équipe ajoutée avec succès", HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateTeam(@PathVariable Long id, @RequestBody TeamRequest teamRequest) {
        Team existingTeam = Team.getTeamById(id);

        if (existingTeam != null) {
            existingTeam.updateTeamDetails(teamRequest.getName(), teamRequest.getCity());

            return ResponseEntity.ok("Équipe mise à jour avec succès");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTeam(@PathVariable Long id) {
        Team existingTeam = Team.getTeamById(id);

        if (existingTeam != null) {


            return ResponseEntity.ok("Équipe supprimée avec succès");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

