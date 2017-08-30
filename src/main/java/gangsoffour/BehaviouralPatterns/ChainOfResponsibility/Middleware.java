package main.java.gangsoffour.BehaviouralPatterns.ChainOfResponsibility;

/**
 * Created by vedant.s on 30/08/17.
 */
public interface Middleware {

    void setNext(Middleware nextMiddleware);

    NumberType  process(int number);

}
