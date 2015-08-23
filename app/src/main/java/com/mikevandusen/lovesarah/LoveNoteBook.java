package com.mikevandusen.lovesarah;

import java.util.Random;

/**
 * Created by Michael on 8/14/2015.
 */
public class LoveNoteBook {

    public String[] mNotes = {
            "Whenever you are down or sad or lonely or blue. " +
                    "Hold my heart close to yours and know, " +
                    "I Will Always Love You!",
            "I will always be there to catch you when you fall!",
            "I can be your Hero Baby! " +
                    "I can kiss away your pain. " +
                    "I will stay with you forever, " +
                    "I will take your breath away!  -Enrique Iglesias",
            "I want to hold you in my arms forever. I want to carry your pain. " +
                    "Know that as long as you are in my life, " +
                    "you will never be alone!",
            "Smile because your beautiful, " +
                    "Smile because your you, " +
                    "Smile because for your love I'm grateful " +
                    "Smile because for you there is nothing I won't do ",
            "The sight of you makes my heart flutter. The feel of you in my arms makes " +
                    "me quake. To be with you forever, there could be nothing better. " +
                    "Every morning to unbridled love you will awake.",
            "You are my Breath of Life",
            "Love is my project, you are my wood. I hope you don't mind, if I spend the " +
                    "rest of my life working on this project with you!",
            "Who could refrain that had a heart to love and in that heart, courage to " +
                    "make love known? -Shakespeare",
            "I have never been more happy to lay in bed tinkering on my phone than with you " +
                    "beside me. I am very thankful that you are here. My life is so much " +
                    "better with you in it!",
            "I often talk about the majesty of the stars, that once in a lifetime light. " +
                    "I realized the same is true of your eyes. I hope to always be deserving " +
                    "of the love and passion I saw in them tonight! I love you!",
            "You drink too much, swear too much, & have questionable morals... you're " +
                    "everything I've ever wanted in a friend and partner!",
            "We should regret out mistakes and learn from them, but never carry them forward " +
                    "into the future with us. -L.M. Montgomery",
            "There's such a lot of different Anne's in you and I am in love with every one of them!",
            "Be careful, lest in casting out your demon you exorcise the best thing in you. -Nietzche",
            "Ughhh...kids make the worst pets!",
            "Late at night and you're in bed asleep. I wrap my arms around you, so I can feel you " +
                    "breath. I don't need to be a superman as long as you will always be my biggest " +
                    "fan. -Heaven by Warrant",
            "I love the way you love me!",
            "Wolves don't lose sleep over the opinions of sheep!",
            "Love is an unconditional commitment to an imperfect person. To love somebody isn`t " +
                    "just a strong feeling. It is a decision, a judgment, and a promise. " +
                    " – Paulo Coelho",
            "Love each other in moderation. That is the key to long-lasting love. Too fast is as " +
                    "bad as too slow. ― William Shakespeare",
            "To be your friend was all I ever wanted; to be your lover was all I ever dreamed. " +
                        " - Valerie Lombardo"


            };

    //Method (Getter)
    public String getQuote() {
        String quote = "";

        //Randomly select a quote
        Random randomGenerator = new Random(); //Constructs a new Random number generator
        int randomNumber = randomGenerator.nextInt(mNotes.length);
        quote = mNotes[randomNumber];
        return quote;
    }
}
