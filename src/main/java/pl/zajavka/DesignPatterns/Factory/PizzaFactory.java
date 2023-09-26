package pl.zajavka.DesignPatterns.Factory;

public class PizzaFactory {
    public static Pizza preparePizza(final String whatPizza) {

        switch (whatPizza) {
            case "Pepperoni":
                return new PepperoniPizza();
            case "Hawaiian":
                return new HawaiianPizza();
            default:
                throw new RuntimeException("I'm sorry, there is only Pepperoni or Hawaiian!");
        }
    }

}
