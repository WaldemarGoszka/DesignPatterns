package pl.zajavka.DesignPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticBlockSingleton2 = StaticBlockSingleton.getInstance();
        System.out.println(staticBlockSingleton2 ==  staticBlockSingleton);
        LazyInitializationSingleton lazyInitializationSingleton = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton lazyInitializationSingleton2 = LazyInitializationSingleton.getInstance();
        System.out.println(lazyInitializationSingleton ==  lazyInitializationSingleton2);

    }
}
