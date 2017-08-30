package main.java.gangsoffour.BehaviouralPatterns.ChainOfResponsibility;


import main.java.gangsoffour.BehaviouralPatterns.ChainOfResponsibility.Middlewares.NegativeCheck;
import main.java.gangsoffour.BehaviouralPatterns.ChainOfResponsibility.Middlewares.PositiveCheck;
import main.java.gangsoffour.BehaviouralPatterns.ChainOfResponsibility.Middlewares.ZeroCheck;

/**
 * Created by vedant.s on 30/08/17.
 */
public class Main {
    public static void main(String[] args) {
        MiddlewareManager chain = new MiddlewareManager();

        PositiveCheck positiveCheck = new PositiveCheck();
        NegativeCheck negativeCheck = new NegativeCheck();
        ZeroCheck zeroCheck = new ZeroCheck();

        chain.add(positiveCheck);
        chain.add(negativeCheck);
        chain.add(zeroCheck);

        int test1 = 5;
        NumberType result1 = chain.process(test1);
        System.out.println(test1 + " is of type " + result1); // 5 is of type NEGATIVE

        int test2 = -5;
        NumberType result2 = chain.process(test2);
        System.out.println(test2 + " is of type " + result2); // -5 is of type NEGATIVE


    }
}
