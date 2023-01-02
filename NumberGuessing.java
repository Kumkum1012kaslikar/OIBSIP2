import java.util.Scanner;

public class NumberGuessing{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int number = 1 + (int)(100* Math.random());
         int guess;
         System.out.println("Guess a number between 1 and 100:");
       do{  
        
        
        guess=sc.nextInt();
        
        
        if(number>guess){System.out.println("Nope the number is higher, guess again."); 
         
        }
        else if(number<guess){
            System.out.println("nope the number is lower, guess again.");
            
        }
       }

        while(number!=guess);
           System.out.println("Answer is : " +number+  " Correct you win..!!,The entered number matches the guesses number.");
        
    }
}