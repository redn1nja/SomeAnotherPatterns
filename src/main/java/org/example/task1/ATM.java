package org.example.task1;

public class ATM {
    public final Handler50 handleA;
    public final Handler20 handleB;
    public final Handler5 handleC;

    public ATM() {
        handleA = new Handler50();
        handleB = new Handler20();
        handleC = new Handler5();
        handleA.setNext(handleB);
        handleB.setNext(handleC);
    }
    public void process(int value){
        handleA.process(value);
    }
}
