package de.dhbwka.se;

import java.util.Scanner;

public class talkToMe
{
    static String input;
    static Scanner scanInput;

    private static void read()
    {
        input = scanInput.nextLine();
        answer();
    }

    private static void answer()
    {
        switch (input)
        {
            case "Hello" :
                System.out.println("Hello, master");;
                break;

            default :
                System.out.println("I can't read that");
                break;
        }
    }
    public static void main(String[] args)
    {
        scanInput = new Scanner(System.in);
        read();
    }
}
