package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    private int cpt;

    public Counter() {
        cpt = 0;
    }

    @Override
    public void inc() throws CounterException {
        cpt ++;
    }

    @Override
    public void add(int step) throws CounterException {
        cpt +=step;
    }

    @Override
    public int getValue() {
        return cpt;
    }
}
