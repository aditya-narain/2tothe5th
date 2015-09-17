package chatBotProgram;

import java.util.Random;
import java.util.Scanner;

/**
 * Simple chat bot with rhetorical Responses.<br/>
 * <i>Caution : For entertainment purpose only. Dont be too hard on it !!!</i>
 * @author Aditya Narain
 */
public class ChatBot {
    /**
     * @param args Arguments
     */
    public static void main(final String[] args) {
        String response;
        int prevResponse = 0;
        int randomNumber;
        final String[] botResponses = {
                "The answer lies in WBT. Next time take it more seriously", "Hmm Interesting, I might log a CR for that", "I understand", "Its Alright", "Hurd dat!!", "Ask me if I care", "Thats interesting lets send an email to Neal Patterson about this one!!", "Better not tell you now", "I am tired zzz, ask me later", "Ok, now I have got a headache!!" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ //$NON-NLS-9$ //$NON-NLS-10$
        System.out.println("Hi My name is CernBot? I am supposed to give rhetorical answers ?"); //$NON-NLS-1$
        final Scanner in = new Scanner(System.in);
        response = in.nextLine();
        System.out.println("Nice to meet you, How may I help you ?"); //$NON-NLS-1$
        response = in.nextLine();
        while (!("bye".equals(response.trim().toLowerCase()))) { //$NON-NLS-1$ 
            final Random random = new Random();
            randomNumber = random.nextInt(botResponses.length);
            while (prevResponse == randomNumber) {
                randomNumber = random.nextInt(botResponses.length);
            }
            prevResponse = randomNumber;
            System.out.println(botResponses[randomNumber]);
            response = in.nextLine();
        }
    }
}
