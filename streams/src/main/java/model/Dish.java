package model;

public class Dish {

    private int Calories;
    private boolean isVegetarian;

    public Dish(int calories, boolean isVegiterian) {
        Calories = calories;
        this.isVegetarian = isVegiterian;
    }

    public int getCalories() {
        return Calories;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public String toString() {
        return "Dish: {" +
                "Calories=" + Calories +
                ", isVegetarian=" + isVegetarian +
                '}';
    }
}
