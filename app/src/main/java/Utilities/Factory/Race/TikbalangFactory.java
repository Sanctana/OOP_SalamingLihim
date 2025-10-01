package Utilities.Factory.Race;

import static Game.GameManager.getScanner;

import Characters.Class.Archer;
import Characters.Class.ClassType;
import Characters.Race.Race;
import Characters.Race.Tikbalang;
import Utilities.Factory.Factory;

public class TikbalangFactory implements Factory {

    public Race createRace() {
        return new Tikbalang();
    }

    public ClassType createClass() {
        System.out.println("Choose your class: ");
        System.out.println("1. Archer ");
        System.out.println("2. Spearmen");
        int choice = getScanner().nextInt();

        ClassType classType;
        switch (choice) {
            case 1:
                classType = new Archer();
                break;
            case 2:
                // classType = new Spearmen();
                // break;
            default:
                System.out.println("Invalid! Defaulting to Archer.");
                classType = new Archer();
                break;
        }

        return classType;
    }

}
