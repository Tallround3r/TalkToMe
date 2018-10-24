package de.dhbwka.se;

import java.util.Scanner;

public class talkToMe
{
    static String input;
    static Scanner scanInput;
    static GreetDismiss conversation;
    static FunFacts funcasts;
    static Praise praise;

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
                conversation.sayHello();
                break;
            case "Hey" :
                conversation.sayHey();;
                break;
            case "Bye" :
                conversation.sayBye();;
                return;
            case "Tell me something" :
                funcasts.randomFact();
                break;
            case "Be nice" :
                praise.praise();
                break;
            
            default :
                System.out.println("I can't read that");
                break;
        }
        read();
    }
    public static void main(String[] args)
    {
        scanInput = new Scanner(System.in);
        conversation = new GreetDismiss();
        funcasts = new FunFacts();
        praise = new Praise();
        read();
    }
}
