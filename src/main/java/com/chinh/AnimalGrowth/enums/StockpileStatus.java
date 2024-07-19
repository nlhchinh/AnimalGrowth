package com.chinh.AnimalGrowth.enums;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public enum StockpileStatus {
    IN_STOCK,
    SOLD_OUT
}
