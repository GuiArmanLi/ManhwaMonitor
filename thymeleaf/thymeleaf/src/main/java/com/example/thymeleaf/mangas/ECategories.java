package com.example.thymeleaf.mangas;

import java.util.UUID;

enum ECategories {
    SHONEN("SHONEN"),
    SHOJO("SHOJO"),
    SEINEN("SEINEM"),
    JOSEI("JOSEI"),
    COMEDIA("COMEDIA"),
    ACAO("ACAO"),
    ROMANCE("ROMANCE"),
    FANTASIA("FANTASIA"),
    HISTORIA("HISTORIA"),
    MISTERIO("MISTERIO"),
    TERROR("TERROR"),
    SCIFI("SCIFI"),
    ESPORTES("ESPORTES"),
    COZINHA("COZINHA"),
    MUSICAL("MUSICAL"),
    GASTRONOMIA("GASTRONOMIA"),
    YURI("YURI"),
    YAOI("YAOI");

    private UUID id;
    private String name;

    ECategories(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
