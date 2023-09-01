package main.java.pl.sda.Pizzeria;
import main.java.pl.sda.Pizzeria.Pizzas.Capriciossa;
import main.java.pl.sda.Pizzeria.Pizzas.Diavola;
import main.java.pl.sda.Pizzeria.Pizzas.Margherita;
import main.java.pl.sda.Pizzeria.Pizzas.Pepperoni;

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





