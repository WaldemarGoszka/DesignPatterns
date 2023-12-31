package pl.zajavka.DesignPatterns.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory<?> pizzaFactory = FactoryProvider.getFactory("Pizza");
        Object pepperoni = pizzaFactory.create("Pepperoni");
        System.out.println((PepperoniPizza)pepperoni); //casting na PepperoniPizza

        Object o = FactoryProvider.getFactory("Pizza").create("Hawaiian");
        System.out.println(o);

    }
}
