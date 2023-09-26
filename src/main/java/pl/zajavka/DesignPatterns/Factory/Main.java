package pl.zajavka.DesignPatterns.Factory;

public class Main {
    public static void main(String[] args) {
        Pizza pepperoni = PizzaFactory.preparePizza("Pepperoni");
        Pizza hawaiian = PizzaFactory.preparePizza("Hawaiian");
        Pizza pepperoni2 = LambdaPizzaFactory.preparePizza("Pepperoni");
        Pizza hawaiian2 = LambdaPizzaFactory.preparePizza("Hawaiian");
    }

}
