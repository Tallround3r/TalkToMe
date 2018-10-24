package de.dhbwka.se;

import java.util.Random;

public class FunFacts
{
    Random random = new Random();

    public void randomFact()
    {
        int rnd = random.nextInt(4);

        switch (rnd)
        {
            case 0 :
                System.out.println("The Earth is a cube");
                break;
            case 1 :
                System.out.println("I'm a computer");

                break;
            case 2 :
                System.out.println("I would never lie to you");
                break;
            case 3 :
                System.out.println("Cake");
                break;

            default :
                System.out.println("Oops, something went wrong");
                break;
        }

    }
}
