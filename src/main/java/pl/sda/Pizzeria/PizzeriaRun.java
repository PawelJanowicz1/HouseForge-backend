package main.java.pl.sda.Pizzeria;

public class PizzeriaRun {
    public static void main(String[] args) {
        Pizza margherita = new Margherita();
        Pizza capriciossa = new Capriciossa();
        Pizza diavola = new Diavola();
        Pizza pepperoni = new Pepperoni();

        margherita.prepare();
        margherita.bake();
        margherita.box();

        System.out.println();

        capriciossa.prepare();
        capriciossa.bake();
        capriciossa.box();

        System.out.println();

        diavola.prepare();
        diavola.bake();
        diavola.box();

        System.out.println();

        pepperoni.prepare();
        pepperoni.bake();
        pepperoni.box();
    }
}
