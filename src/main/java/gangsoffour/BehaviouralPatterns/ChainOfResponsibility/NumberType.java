package main.java.gangsoffour.BehaviouralPatterns.ChainOfResponsibility;

/**
 * Created by vedant.s on 30/08/17.
 */
public enum NumberType {
    POSITIVE(1),
    NEGATIVE(-1),
    ZERO(0),
    NONE(-2);

    int type;
    NumberType(int type){
        this.type = type;
    }

    public int value() {
        return this.type;
    }

}
