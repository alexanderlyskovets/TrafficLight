package ru.lyskovets.model;

public enum Color {
    RED("Красный"), YELLOW("Жёлтый"), GREEN("Зелёный");

    private String title;

    Color(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}