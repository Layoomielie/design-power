package com.example.builder.kfc;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/6 9:25
 */

/**
 * @author：张鸿建
 * @time：2019/6/6
 * @desc：      汉堡和饮料是不变的  但组合是经常变化的 通过构建者模式去创建组合
 **/
public class Main {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareNonVegMeal();
        System.out.println("NonVegMeal");
        System.out.println("cost "+meal.getCost());
        meal.showItems();
    }
}
