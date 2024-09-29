package com.amarthya.spring_boot_concepts.lombok;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.Synchronized;
import lombok.experimental.Delegate;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileReader;


// Creates log object automatically
@Slf4j
public class MainLombok {
    // Use methods of other cls
    @Delegate
    OtherDelegateCls otherDelegate;

    int count=0;


    private String testMtd() {
        ModelLombok ml = new ModelLombok("", 1);
        ml.getNum();
        ml.getVal();
        ml.equals(null);
        ml.hashCode();
        ml.toString();
        log.info("ml",ml);
        return "";
    }

    //Handles class not found exception automatically
    @SneakyThrows
    private String exceptionAutoHandling() {
        Class temp = Class.forName("gfg");
        return "";
    }


    private String tryWithResourcesAutoHandling() {
        // The file path you want to read
        String filePath = "example.txt";

        try {
            // Instead of using try with resources cleanup annotation handles closing of resources
            @Cleanup BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (Exception e){

        }
        return filePath;
    }
    // Creates a private final lock object instead of this & synchronizes below mtds
    @Synchronized
    private void autoSunchronizedCountAddMtd(){
        count++;
    }
    @Synchronized
    private void autoSunchronizedCountPrintMtd(){
        System.out.println(count);
    }
    //@SuperBuilder should be annotated in both parent & child cls
    private void superBuilder(){
        ModelChildLombok mcl= ModelChildLombok.builder().eid("").name("").age(1).build();

    }

    private void returnOtherDelegateClsMtd(){
        otherDelegate.returnSomething();
    }

    private void autoUtilClaMtd(){
       AutoUtilityCls.autoStaticMtd();
    }




}
