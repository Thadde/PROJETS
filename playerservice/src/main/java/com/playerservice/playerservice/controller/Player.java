package com.playerservice.playerservice.controller;

public class Player {
    private Long id;
    private String name;
    private int age;

    // Méthode pour ajouter des valeurs à un joueur
    public void addPlayerDetails(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    // Méthode pour récupérer les détails d'un joueur par son identifiant
    public static Player getPlayerById(Long id) {

        Player player = new Player();
        player.addPlayerDetails(id, "John Doe", 25);

        return player;
    }
}