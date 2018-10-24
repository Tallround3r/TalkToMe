package de.dhbwka.se;

import java.util.Random;

public class Praise
{
    Random random = new Random();

    public void praise()
    {
        int rnd = random.nextInt(3);

        switch (rnd)
        {
            case 0 :
                System.out.println("Your work is great");
                break;
            case 1 :
                System.out.println("Keep on going");
                break;
            case 2 :
                System.out.println("I'm glad to be able to talk to you");
                break;

            default :
                System.out.println("Oops, something went wrong");
                break;
        }
    }
}
