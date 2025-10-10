package Utilities.Factory;

import Characters.Race.Race;
import Characters.Class.ClassType;

public interface Factory {
    Race createRace();

    ClassType createClass();
}
