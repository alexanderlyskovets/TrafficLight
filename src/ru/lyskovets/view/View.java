package ru.lyskovets.view;

import ru.lyskovets.model.Color;

public class View {
    private static final String WELCOME_LINE = "Определите время работы всех режимов светофора (в минутах)";
    private static final String QUESTION_LINE = "Сколько будет гореть";
    private static final String ERROR_LINE = "Введите число больше нуля: ";
    private static final String COLOR_LIGHT_ON = "Горит свет: ";

    public static void printWelcome() {
        System.out.println(WELCOME_LINE);
        System.out.println();
    }

    public void printSelectDuration(Color color) {
        System.out.println(QUESTION_LINE + " " + color.toString() + ": ");
    }

    public void printError() {
        System.out.println(ERROR_LINE);
    }

    public void printColorLightOn(Color key) {
        System.out.println(COLOR_LIGHT_ON + key.toString());
    }
}