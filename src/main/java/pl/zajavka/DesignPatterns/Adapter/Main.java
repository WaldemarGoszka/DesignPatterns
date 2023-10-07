package pl.zajavka.DesignPatterns.Adapter;

public class Main {
    public static void main(String[] args) {
        Dimension dimension = new SonyTV(); // Data Provider - telewizor
        DimensionAdapter dimensionAdapter = new DimensionAdapterImpl(dimension); //Adapter
        System.out.println("original: " + dimension.getDimension());
        System.out.println("adapted: " + dimensionAdapter.getDimension());


    }
}
