package pl.zajavka.DesignPatterns.AbstractFactory;

public interface AbstractFactory<T> {
    Pizza create(String type);
}
