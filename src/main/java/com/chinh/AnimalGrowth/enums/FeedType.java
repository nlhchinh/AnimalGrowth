package com.chinh.AnimalGrowth.enums;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public enum FeedType {
    POWDERED,
    PELLET
}
