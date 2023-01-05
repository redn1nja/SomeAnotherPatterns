package org.example.task1;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Handler {
    private int divisor;
    private Handler next;
    public void process(int price){
        System.out.println(price/divisor + "* " + divisor);
        if (next!=null) {
            next.process(price % divisor);
        }
    }

}
