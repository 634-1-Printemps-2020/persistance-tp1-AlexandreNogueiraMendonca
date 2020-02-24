package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {
    private final int MAX = 10;

    public UpperLimitedPositiveCounter() {
        super();
    }

    @Override
    public void inc() throws CounterException {
        cpt++;
        if (cpt > MAX) {
            throw new CounterException();
        }
    }

    @Override
    public void add(int step) throws CounterException {
        cpt +=step;
        if (cpt > MAX || cpt < 0) {
            throw new CounterException();
        }
    }

    @Override
    public int getValue() {
        return cpt;
    }
}
