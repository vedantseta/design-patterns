package main.java.gangsoffour.BehaviouralPatterns.ChainOfResponsibility;

import java.util.LinkedList;

/**
 * Created by vedant.s on 30/08/17.
 */
public class MiddlewareManager {
    private LinkedList<Middleware> chain;
    MiddlewareManager(){
        this.chain = new LinkedList<Middleware>();
    }
    public void add(Middleware middleware){
        if(this.chain.size() > 0) {
            this.chain.getLast().setNext(middleware);
        }
        this.chain.add(middleware);

    }
    public NumberType process(int number){

        // IF NO MIDDLEWARE DEFINED
        if(this.chain.size() == 0) {
            return NumberType.NONE;
        }
        return chain.get(0).process(number);
    }
}
