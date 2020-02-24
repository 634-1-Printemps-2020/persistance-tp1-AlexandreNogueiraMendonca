package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) {
        int add = -10;

        Counter cpt = new Counter();
        System.out.println("Avant modif de cpt = " + cpt.getValue());
        try {
            cpt.inc();
            System.out.println("inc de cpt = " + cpt.getValue());
            cpt.add(add);
            System.out.println("add " + add + " de cpt = " + cpt.getValue());

            System.out.println();

            UpperLimitedPositiveCounter cptLim = new UpperLimitedPositiveCounter();
            System.out.println("Avant modif de cptLim = " + cptLim.getValue());
            cptLim.inc();
            System.out.println("inc de cptLim = " + cptLim.getValue());
            cptLim.add(add);
            System.out.println("add " + add + " de cptLim = " + cptLim.getValue());

        } catch (CounterException e) {
            System.out.println("Le compteur doit être positif et ne doit pas dépasser la limite");
        }
    }
}
