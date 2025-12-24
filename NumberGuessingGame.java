import java.util.*;
class NumberGuessingGame{

    public static void guessingnumber() {
         Scanner sc=new Scanner(System.in);
         int number=1+(int)(Math.random()*100);
         int attempts=0;
         int k=5;
         boolean flag=false;
         System.out.println("Welcome to NumberGuessing Game!!!.In this game you need to guess the correct number");
         System.out.println("You have "+k+" numbers of attempts");
          while(!flag){
         for(int i=0;i<k;i++){
            System.out.println("Enter your guessing number...");
            int guess=sc.nextInt();
            attempts++;
             
            if(guess==number){
                System.out.println("Congratulations...You correctly guessed the number");
                flag=true;
                break;
            }
            else if(guess>number){
                System.out.println("Your guessed number is greater...");
            }
            else{
                System.out.println("Your guessed number is lesser...");
            }

     }
           if(!flag){
             System.out.println("You failed to guess the number...");
             System.out.println("Do wish to continue the game...(yes/no)");
             String response=sc.next();
             if(!response.equalsIgnoreCase("yes")){
                System.out.println("Game Over! The correct number was: " + number);
                break;
             }
           }
        }
    sc.close();
    }
    public static void main(String args[]){
    guessingnumber();
    }

    
}