package Seminar4;

public class Archer extends Warrior<Bow, BucklerShield> {
    private Integer range;

    public Archer(String name, Integer healthPoint, Bow weapon, BucklerShield shield, Integer range) {
        super(name, healthPoint, weapon, shield);
        this.range = range;
    }

    public Archer(String name, Integer healthPoint, Bow weapon, Integer range) {
        super(name, healthPoint, weapon);
        this.range = range;
    }

    public Integer getRange() {
        return range;
    }

    @Override
    public String toString() {
        return String.format("Archer: %s  range: %d", super.toString(), range);
    }

}