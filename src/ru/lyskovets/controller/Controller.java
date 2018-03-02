package ru.lyskovets.controller;

import ru.lyskovets.model.Color;
import ru.lyskovets.view.View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    private static final Integer MULTIPLIER = 1000 * 60; // 1000 до секунд 60 до минут
    private View view = new View();

    public int selectDuration(Color color) {
        view.printSelectDuration(color);
        Scanner scanner = new Scanner(System.in);
        int duration;
        while (true) {
            try {
                duration = scanner.nextInt();
                if (duration <= 0) {
                    throw new NumberFormatException();
                }
                break;
            }
            catch (InputMismatchException | NumberFormatException e) {
                view.printError();
            }
            scanner.nextLine();
        }
        return duration;
    }

    public void doLightning(Color key, Integer value) throws InterruptedException {
        view.printColorLightOn(key);
        Thread.sleep(value * MULTIPLIER);
    }
}