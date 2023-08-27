package main.java.pl.sda.Pizzeria;

import java.util.List;

public class Pizza {
    private String name;
    private int bakingTime;
    private List<String> ingredients;

    public Pizza(String name, int bakingTime, List<String> ingredients) {
        this.name = name;
        this.bakingTime = bakingTime;
        this.ingredients = ingredients;
    }
    public void prepare(){
        System.out.println(String.format("In the process of making %s pizza, the following ingredients will be utilized: %s.",
                name, ingredients.toString()));
    }

    public void bake() {
        System.out.println(String.format("We are making your %s pizza, set aside %d minutes.", name, bakingTime));}
    public void box(){
        System.out.println(String.format("Your %s pizza is being boxed up.", name));
    }

}
