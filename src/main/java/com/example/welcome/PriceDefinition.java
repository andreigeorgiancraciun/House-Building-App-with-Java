package com.example.welcome;

import java.math.BigDecimal;

public class PriceDefinition {

    private final BigDecimal floorPrice;
    private final BigDecimal wallPrice;
    private final BigDecimal carportPrice;

    public PriceDefinition(BigDecimal floorPrice, BigDecimal wallPrice, BigDecimal carportPrice) {
        this.floorPrice = floorPrice;
        this.wallPrice = wallPrice;
        this.carportPrice = carportPrice;
    }

    public BigDecimal getFloorPrice() {
        return floorPrice;
    }

    public BigDecimal getWallPrice() {
        return wallPrice;
    }

    public BigDecimal getCarportPrice() {
        return carportPrice;
    }
}
