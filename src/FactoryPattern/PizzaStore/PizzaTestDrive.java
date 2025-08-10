package FactoryPattern.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
//        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.printf("A가 주문한 " + pizza.getName() + "\n");

//        pizza = chicagoStore.orderPizza("cheese");
//        System.out.printf("B가 주문한 " + pizza.getName() + "\n");


    }
}
