package Seminar4;

public class Hero extends Warrior<Weapon, HeavyShield> {

    public Hero(String name, Integer healthPoint, Weapon weapon, HeavyShield shield) {
        super(name, healthPoint, weapon, shield);

    }

    public Hero(String name, Integer healthPoint, Weapon weapon) {
        super(name, healthPoint, weapon);
    }

    @Override
    public String toString() {
        return String.format("Hero: %s", super.toString());
    }

}