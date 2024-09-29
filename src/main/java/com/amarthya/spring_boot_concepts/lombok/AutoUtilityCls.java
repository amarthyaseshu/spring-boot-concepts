package com.amarthya.spring_boot_concepts.lombok;

import lombok.experimental.UtilityClass;

// Lombok creates pvt constructor automatically & class as final as it treats as util cls
@UtilityClass
public class AutoUtilityCls {

    // makes this field static
    String autoStatic;

    // makes this mtd static
    public String autoStaticMtd(){
        return "lombok makes it auto static";
    }

}
