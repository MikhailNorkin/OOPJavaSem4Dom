package Seminar4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> {
    private Hero hero;
    private List<T> teamList = new ArrayList<>();

    public Team(Hero hero) {
        this.hero = hero;

    }

    public void add(T person) {
        teamList.add(person);
    }

    @Override
    public Iterator<T> iterator() {
        return teamList.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(hero.toString() + "\n");
        for (T t : this) {
            sb.append(t.toString() + "\n");
        }
        return sb.toString();
    }

    public Integer getTeamHealthPoint() {
        int sum = hero.getHealthPoint();
        for (T t : this) {
            sum += t.getHealthPoint();
        }
        return sum;
    }
}