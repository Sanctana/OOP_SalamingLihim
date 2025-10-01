package Characters.Race;

import Actions.Attack;

public class Tikbalang extends Race {
    public Tikbalang() {
        super("Tikbalang", 95, 80, new Attack("Kick", 15, 15));
    }

    @Override
    public String toString() {
        return "+===================== Tikbalang ============================+\n" +
                "A tikbalang is a mythical, half-human, half-horse creature, known for its horse-like head and hooves,\n"
                +
                "long limbs, and ability to lead travelers astray in forests and mountains. Often portrayed as a\n" +
                "deceptive prankster or trickster, it can also be seen as a guardian of nature.\n" +
                "HP: 95\n" +
                "Mana: 80\n" +
                "+=============================================================+";
    }
}
