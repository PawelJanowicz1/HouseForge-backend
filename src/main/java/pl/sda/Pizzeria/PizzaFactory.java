package main.java.pl.sda.Pizzeria;
import java.util.Arrays;

final public class PizzaFactory {
    enum PizzaKind {
        MARGHERITA,
        PEPPERONI,
        DIAVOLA,
        CAPRICIOSSA;

    }
    public Pizza createPizza(PizzaKind kind) {
        switch (kind) {
            case MARGHERITA:
                return new Margherita();

            case PEPPERONI:
                return new Pepperoni();

            case DIAVOLA:
                return new Diavola();
            case CAPRICIOSSA:
                return new Capriciossa();
            default:
                System.out.println("Pizza not found");
        }
        return new Margherita();
    }
}





