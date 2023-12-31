package pl.zajavka.DesignPatterns.AbstractFactory;

public class FactoryProvider {
    public static AbstractFactory<?> getFactory(String whatFactory) {
        switch (whatFactory) {
            case "Pizza":
                return new PizzaFactory();
//            case "Car":
//                return new CarFactory();
            default:
                throw new RuntimeException("I'm sorry, we only produce pizzas or cars!");
        }
    }

}
