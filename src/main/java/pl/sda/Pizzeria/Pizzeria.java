package main.java.pl.sda.Pizzeria;

public class Pizzeria {
    PizzaFactory pizzaFactory;

    public Pizzeria(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;


}
    public Pizza orderPizza(PizzaFactory.PizzaKind kind) {
        Pizza pizza = pizzaFactory.createPizza(kind);

        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;

    }
}