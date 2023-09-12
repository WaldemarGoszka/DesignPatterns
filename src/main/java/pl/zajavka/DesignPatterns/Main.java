package pl.zajavka.DesignPatterns;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Clas clas = new Clas();
        Function<Integer,Boolean> predicate = a -> a==5;
        System.out.println(licz(clas.a, predicate));

    }

    private static boolean licz(Integer a, Function<Integer,Boolean>  predicate) {
        return predicate.apply(a);
    }
}
