import com.gerard.Duck;
import com.gerard.MallardDuck;
import com.gerard.FlyBehavior;
import com.gerard.FlyWithWings;
import com.gerard.FlyNoWay;
import com.gerard.QuackBehavior;
import com.gerard.Quack;

public class MiniDuckSimulator
{
    public static void main(String[] args)
    {
        //method1
	System.out.println("Method1:");
        FlyBehavior fb = new FlyWithWings();
        QuackBehavior qb = new Quack();

        Duck mallard = new MallardDuck(fb, qb);
	mallard.performFly();
	mallard.performQuack();

	mallard.setFlyBehavior(new FlyNoWay() );
	mallard.performFly();

	//method2
	System.out.println("\nMethod2:");
	Duck mallard2 = new MallardDuck();
	mallard2.performFly();
	mallard2.performQuack();

	mallard2.setFlyBehavior(new FlyNoWay() );
	mallard2.performFly();

    }
}
