package com.example.builder.kfc;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/6 9:41
 */

import com.example.builder.kfc.burger.ChickenBurger;
import com.example.builder.kfc.burger.VegBurger;
import com.example.builder.kfc.drink.Coke;
import com.example.builder.kfc.drink.Pepsi;

/**
 * @author：张鸿建
 * @time：2019/6/6
 * @desc：
 **/
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
