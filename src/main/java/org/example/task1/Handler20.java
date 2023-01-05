package org.example.task1;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Handler20 extends Handler{
    public Handler20(){
        setDivisor(20);
    }
    @Override
    public void process(int price) {
        super.process(price);
    }
}

