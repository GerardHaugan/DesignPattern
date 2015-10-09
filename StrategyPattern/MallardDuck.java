package com.gerard;

public class MallardDuck extends Duck
{
    public MallardDuck()
    {
        flyBehavior = new FlyWithWings();
	quackBehavior = new Quack();
    }

    public MallardDuck( FlyBehavior fb, QuackBehavior qb )
    {
        flyBehavior = fb;
	quackBehavior = qb;
    }

    public void display()
    {
        System.out.println("I'm a real Mallard duck");
    }

}
