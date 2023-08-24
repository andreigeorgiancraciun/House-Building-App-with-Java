package com.example.welcome;

import java.math.BigDecimal;

public class PriceCalculator {

    private final AreaCalculator areaCalculator;
    private final PriceDefinition priceDefinition;

    public PriceCalculator(AreaCalculator areaCalculator, PriceDefinition priceDefinition) {
        this.areaCalculator = areaCalculator;
        this.priceDefinition = priceDefinition;
    }

    public BigDecimal getFloorPrice() {
        var area = BigDecimal.valueOf(areaCalculator.getFloorArea());
        return area.multiply(priceDefinition.getFloorPrice());
    }

    public BigDecimal getWallPrice() {
        var area = BigDecimal.valueOf(areaCalculator.getWallArea());
        return area.multiply(priceDefinition.getWallPrice());
    }

    public BigDecimal getCarportPrice() {
        var area = BigDecimal.valueOf(areaCalculator.getCarportArea());
        return area.multiply(priceDefinition.getCarportPrice());
    }

    public BigDecimal getTotalPrice() {
        var floorPrice = getFloorPrice();
        var wallPrice = getWallPrice();
        var carportPrice = getCarportPrice();
        return floorPrice.add(wallPrice).add(carportPrice);
    }
}
