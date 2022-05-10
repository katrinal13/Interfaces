import java.util.ArrayList;
import java.util.Collections;

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

        Birthday b1 = new Birthday("Barbara", 3, 24, 1989);
        Birthday b2 = new Birthday("Marisa", 5, 30, 1999);
        Birthday b3 = new Birthday("Adam", 5, 30, 1999);
        Birthday b4 = new Birthday("Carol", 3, 24, 1945);
        Birthday b5 = new Birthday("Barbara", 3, 26, 1945);
        Birthday b6 = new Birthday("Adam", 2, 30, 1999);

        ArrayList<Birthday> birthdays = new ArrayList<Birthday>();
        birthdays.add(b1);
        birthdays.add(b2);
        birthdays.add(b3);
        birthdays.add(b4);
        birthdays.add(b5);
        birthdays.add(b6);

        Collections.sort(birthdays);
        for (Birthday birthday : birthdays)
        {
            System.out.println(birthday);
        }

    }
}
