package org.example.task1;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Handler50 extends Handler{
    public Handler50(){
        setDivisor(50);
    }

    @Override
    public void process(int price) {
        super.process(price);
    }
}