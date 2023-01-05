package org.example.task1;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Handler5 extends Handler{
    public Handler5(){
        setDivisor(5);
    }
    @Override
    public void process(int price) {
        super.process(price);
    }
}

