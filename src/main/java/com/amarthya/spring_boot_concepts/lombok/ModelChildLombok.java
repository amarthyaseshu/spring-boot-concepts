package com.amarthya.spring_boot_concepts.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class ModelChildLombok extends ModelParentLombok{

    private int age;
}
