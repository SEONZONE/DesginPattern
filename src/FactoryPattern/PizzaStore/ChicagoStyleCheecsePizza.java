package FactoryPattern.PizzaStore;

public class ChicagoStyleCheecsePizza extends Pizza {
    public ChicagoStyleCheecsePizza() {
        name = "시카고 피자";
        dough = "아주 두꺼운 크러스트 도우";
        sauce = "플럼토마토 소스";
        toppings.add("모짜렐라 치즈~~");
    }
    void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}
