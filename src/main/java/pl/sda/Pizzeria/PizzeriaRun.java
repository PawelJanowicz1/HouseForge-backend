package main.java.pl.sda.Pizzeria;

import main.java.pl.sda.Pizzeria.Pizza;
import main.java.pl.sda.Pizzeria.Pizzas.*;

public class PizzeriaRun {
    public static void main(String[] args) {
        Pizza margherita = new Margherita();
        Pizza capriciossa = new Capriciossa();
        Pizza diavola = new Diavola();
        Pizza pepperoni = new Pepperoni();
        Pizza vesuvio = new Vesuvio();
        Pizza bianca = new Bianca();
        Pizza hawaii = new Hawaii();
        Pizza marina = new Marina();


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

        System.out.println();

        vesuvio.prepare();
        vesuvio.bake();
        vesuvio.box();

        System.out.println();

        bianca.prepare();
        bianca.bake();
        bianca.box();

        System.out.println();

        hawaii.prepare();
        hawaii.bake();
        hawaii.box();

        System.out.println();


        marina.prepare();
        marina.bake();
        marina.box();
    }
}

