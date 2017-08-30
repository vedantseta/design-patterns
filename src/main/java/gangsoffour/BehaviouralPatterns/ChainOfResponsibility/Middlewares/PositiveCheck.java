package main.java.gangsoffour.BehaviouralPatterns.ChainOfResponsibility;

/**
 * Created by vedant.s on 30/08/17.
 */
public class PositiveCheck implements Middleware {
    private Middleware next;

    PositiveCheck(){
        this.next = null;
    }

    @Override
    public void setNext(Middleware nextMiddleware) {
        this.next = nextMiddleware;
    }

    @Override
    public NumberType  process(int number) {
        if(number > 0) {
            return NumberType.POSITIVE;
        }

        if(this.next != null) {
            return this.next.process(number);
        }

        return NumberType.NONE;
    }

}
