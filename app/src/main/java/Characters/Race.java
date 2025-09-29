package Characters;

public class Race {

    private String name;
    private int baseHP;
    private int baseMana;

    public Race(String name, int baseHP, int baseMana) {
        this.name = name;
        this.baseHP = baseHP;
        this.baseMana = baseMana;
    }

    public String getName(){
        return name;
    }

    public int getBaseHP() {
        return baseHP;
    }

    public int getBaseMana() {
        return baseMana;
    }

}
