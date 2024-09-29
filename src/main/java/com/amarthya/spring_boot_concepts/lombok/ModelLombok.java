package com.amarthya.spring_boot_concepts.lombok;

import lombok.AllArgsConstructor;
import lombok.Value;

//Lombok generates a final class with private final fields, a constructor, getters, toString(), equals(), and hashCode() methods.
@Value
public class ModelLombok {

    String val;
    int num;

}
