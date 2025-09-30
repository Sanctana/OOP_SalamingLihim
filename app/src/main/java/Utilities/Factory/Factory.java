package Utilities.Factory;

import Characters.Race.*;
import Characters.Class.ClassType;

public interface Factory {
    Race createRace();

    ClassType createClass();
}
