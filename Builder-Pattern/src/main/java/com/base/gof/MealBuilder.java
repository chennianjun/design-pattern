package com.base.gof;

/**
 * @project:design-pattern
 * @package:com.base.gof
 * @create_date:2018/2/2 13:41
 * @author:Subtimental
 * @description:TODO
 */
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
