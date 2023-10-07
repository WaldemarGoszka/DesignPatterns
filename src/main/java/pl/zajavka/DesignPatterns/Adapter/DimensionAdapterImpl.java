package pl.zajavka.DesignPatterns.Adapter;

import java.math.BigDecimal;

public class DimensionAdapterImpl implements DimensionAdapter {

    private static final double INCH_TO_METER = 0.0254;
    private Dimension dimension;

    public DimensionAdapterImpl(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public BigDecimal getDimension() {
        return convertIntToMeter(dimension.getDimension());
    }

    private BigDecimal convertIntToMeter(BigDecimal inch) {
        return BigDecimal.valueOf(INCH_TO_METER).multiply(inch);
    }

}
