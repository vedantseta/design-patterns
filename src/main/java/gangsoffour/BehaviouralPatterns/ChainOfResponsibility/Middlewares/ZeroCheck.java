package main.java.gangsoffour.BehaviouralPatterns.ChainOfResponsibility.Middlewares;

import main.java.gangsoffour.BehaviouralPatterns.ChainOfResponsibility.Middleware;
import main.java.gangsoffour.BehaviouralPatterns.ChainOfResponsibility.NumberType;

/**
 * Created by vedant.s on 30/08/17.
 */
public class ZeroCheck implements Middleware {
    private Middleware next;

    public ZeroCheck(){
        this.next = null;
    }

    @Override
    public void setNext(Middleware nextMiddleware) {
        this.next = nextMiddleware;
    }

    @Override
    public NumberType process(int number) {
        if(number == 0) {
            return NumberType.ZERO;
        }

        if(this.next != null) {
            return this.next.process(number);
        }

        return NumberType.NONE;
    }

}
