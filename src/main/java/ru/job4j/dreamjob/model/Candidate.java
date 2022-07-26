package ru.job4j.dreamjob.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Candidate {
    private int id;
    private String name;
    private String description;
    private LocalDateTime created;
    private byte[] photo;
    private boolean visible;

    public Candidate() {
    }

    public Candidate(int id, String name) {
        this.id = id;
        this.name = name;
        this.created = LocalDateTime.now();
    }

    public Candidate(int id, String name, String description, byte[] photo, boolean visible) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.created = LocalDateTime.now();
        this.photo = photo;
        this.visible = visible;
    }

    public Candidate(int id, String name, String description, LocalDateTime created, byte[] photo, boolean visible) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.created = created;
        this.photo = photo;
        this.visible = visible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Candidate candidate = (Candidate) o;
        return id == candidate.id && Objects.equals(name, candidate.name)
                && Objects.equals(description, candidate.description)
                && Objects.equals(created, candidate.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, created);
    }
}