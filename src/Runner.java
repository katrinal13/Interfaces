import java.util.ArrayList;

public class Runner
{
    public static void main(String[] args)
    {
        ArrayList<Fed> feeding = new ArrayList<Fed>();
        feeding.add(new Horse(5));
        feeding.add(new VenusFlyTrap(6));
        feeding.add(new Horse(8));
        feeding.add(new VenusFlyTrap(2));
        feeding.add(new Horse(10));
        feeding.add(new VenusFlyTrap(4));
        feeding.add(new Horse(3));
        feeding.add(new VenusFlyTrap(3));

        for (Fed organism : feeding)
        {
            organism.feed();
        }
    }
}
