package Seminar4;

public class BucklerShield implements Shield {

    @Override
    public Integer absorb() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format(" Shield absorb %d", absorb());
    }
}