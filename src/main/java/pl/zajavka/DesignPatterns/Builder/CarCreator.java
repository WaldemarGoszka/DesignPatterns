package pl.zajavka.DesignPatterns.Builder;

public class CarCreator {
    void create() {

        Car.CarBuilder emptyCar = Car.builder();
        Car build = emptyCar.build();

        Car anotherCar = Car.builder()
                .brand("Ford")
                .model("Mustang")
                .towbar("someTowbar")
                .year(1969)
                .build();

        System.out.println(emptyCar);
        System.out.println(anotherCar);
    }

}
