package com.amarthya.spring_boot_concepts.multiplereturnval;


import org.apache.commons.lang3.tuple.Pair;

public class MultipleReturnVal {
    // Pair is by default immutable in nature, if needed use MutablePair
    public Pair<Order,Shipping> data(){
        return Pair.of(new Order(),new Shipping());
    }

    public void getInfo(){
        Pair<Order, Shipping> data = data();
        Order left = data.getLeft();
        Shipping right = data.getRight();
    }

    // Same way we have Triple object which has left, middle & right
}
