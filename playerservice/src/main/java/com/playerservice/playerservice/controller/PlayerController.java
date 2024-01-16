package com.playerservice.playerservice.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @GetMapping("/{id}")
    public ResponseEntity<Player> getPlayerDetails(@PathVariable Long id) {

        Player player = Player.getPlayerById(id);

        if (player != null) {
            return ResponseEntity.ok(player);
        } else {
            return ResponseEntity.notFound().build();
        }
    }





    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePlayer(@PathVariable Long id) {
        Player existingPlayer = Player.getPlayerById(id);

        if (existingPlayer != null) {
            // Implémentez la logique pour supprimer le joueur existant (base de données, service, etc.)

            return ResponseEntity.ok("Player supprimé avec succès");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}