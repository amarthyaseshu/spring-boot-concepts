package com.amarthya.spring_boot_concepts.lombok;

import lombok.Builder;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class ModelParentLombok {
    private String name;
    private String eid;
}
