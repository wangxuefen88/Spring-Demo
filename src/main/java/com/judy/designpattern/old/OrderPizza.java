package com.judy.designpattern.old;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 20:32 2019/5/28
 */
public class OrderPizza {
    private String PizzaName;
    Pizza pizza = null;
    public  Pizza  create(String pizzaName) {
        PizzaName = pizzaName;
        if (PizzaName.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (PizzaName.equals("greekpizza")) {
            pizza = new GreekPizza();
        }
        return pizza;
    }
}
