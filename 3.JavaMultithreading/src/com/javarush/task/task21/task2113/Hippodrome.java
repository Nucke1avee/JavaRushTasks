package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hippodrome {
    private static List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public Horse getWinner() {
        return horses.stream().max(Comparator.comparing(Horse::getDistance)).orElse(null); //stream api (на потом)
    }

    public void printWinner() {
        System.out.printf("Winner is %s!%n", getWinner().getName()); //%s - string, %n - line separator
    }

    public void move() {
        for (Horse h : horses) {
            h.move();
        }
    }

    public void print() {
        for (Horse h : horses) {
            h.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public static void main(String[] args) {
        horses = new ArrayList<>();
        horses.add(new Horse("Hohohorse", 3, 0));
        horses.add(new Horse("Ololoshad'", 3, 0));
        horses.add(new Horse("Pony", 3, 0));

        game = new Hippodrome(horses);

        try {
            game.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        game.printWinner();
    }
}
