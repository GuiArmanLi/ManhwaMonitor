package com.example.thymeleaf.mangas;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;
import java.util.List;

@Entity(name = "tMangas")
public class MangaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private UUID idUser;

    @Column(unique = true)
    private String name;

    private String describe;
    private String image;
    private List<ECategories> categories;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public MangaModel() {
    }

    public MangaModel(String name) {
        this.name = name;
    }

    public MangaModel(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    public MangaModel(String name, String describe, String image) {
        this.name = name;
        this.describe = describe;
        this.image = image;
    }

    public MangaModel(String name, String describe, String image, List<ECategories> categories) {
        this.name = name;
        this.describe = describe;
        this.image = image;
        this.categories = categories;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getIdUser() {
        return idUser;
    }

    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<ECategories> getCategories() {
        return categories;
    }

    public void setCategories(List<ECategories> categories) {
        this.categories = categories;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "MangaModel [id=" + id + ", idUser=" + idUser + ", name=" + name + ", describe=" + describe + ", image="
                + image + ", categories=" + categories + ", createdAt=" + createdAt + "]";
    }
}
