package FactoryPattern.PizzaStore;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Cheese Pizza";
        dough = "썬 크러스트 도우";
        sauce = "마리나라 소스";
        toppings.add("잘게 썬 레지아노 치즈");
    }
}
