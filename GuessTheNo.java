import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int noOfGuesses = 0;
    public int inputNumber;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

     Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();


    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.printf("Yes! you guest it right, it was %d\n you guest in %d  attempts ", number, noOfGuesses);
            return true;
        } else if (inputNumber>number) {
            System.out.println("Too High...");
        }
        else if (inputNumber<number) {
            System.out.println("Too Low...");

        }
        return false;


    }
}


public class GuessTheNo {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b=false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();

        }

    }
}
