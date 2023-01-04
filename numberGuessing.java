package OibSip;

import javax.swing.*;
public class numberGuessing {
    static int count=1;

    public static void main(String[] args) {
       
        int computerNumber=(int)(Math.random()*100+1);
        int userAnswer=0;
        System.out.println("The Correct Guess would be : "+computerNumber);
        
        while(userAnswer != computerNumber)
        {
            String response=JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", "Guessing Game",3);
            userAnswer=Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, " "+ determineGuess(userAnswer, computerNumber,count));
            
        }
    }
    
    public static String determineGuess(int userAnswer, int computerNumber, int count)
    {
        if(userAnswer <=0 || userAnswer >100)
            return "Your guess is invalid";
        else if(userAnswer == computerNumber)
            return "Correct! \n Total Guesses : "+count;
        else if(userAnswer > computerNumber)
            return "Your guess is too high, try again, \n Try Number : "+ count++;
        else if(userAnswer < computerNumber)
            return "Your guess is too low, try again, \n Try Number : "+ count++;
        else
            return "Your guess is incorrect \n Try Number : "+ count++;
    }
    
}