package ru.lyskovets.model;

public enum Color {
    RED, YELLOW, GREEN;

    @Override
    public String toString() {
        switch (this) {
            case RED:
                return "Красный";
            case YELLOW:
                return "Жёлтый";
            case GREEN:
                return "Зелёный";
        }
        return null; // unreachable but necessarily
    }
}