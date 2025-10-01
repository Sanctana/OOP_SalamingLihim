package Utilities.Factory.Race;

import Characters.Race.*;
import Utilities.Factory.Factory;
import Characters.Class.ClassType;
import Characters.Class.*;

import static Main.GameManager.getScanner;

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
