package ru.lyskovets.model;

import ru.lyskovets.controller.Controller;
import ru.lyskovets.view.View;

import java.util.TreeMap;

public class Model {
    private final int NUMBER_OF_ROUNDS = 1; // количество циклов
    private TreeMap<Color, Integer> durationMap = new TreeMap<>();
    private Controller controller = new Controller();

    public void run() {
        // заголовок
        View.printWelcome();
        // ввод параметров
        setDurations();
        // светофор работает
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            doLightning();
        }
    }

    private void setDurations() {
        for (Color color: Color.values()) {
            int duration;
            duration = controller.selectDuration(color);
            durationMap.put(color, duration);
        }
    }

    private void doLightning() {
        durationMap.forEach((key, value) -> {
            try {
                controller.doLightning(key, value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}