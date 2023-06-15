import java.util.Random;
import java.util.Scanner;

public class project_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets play!\tChoose a no. -\n(0) for Stone \n(1) for Paper \n(2) for Scissor  " );
        int a = sc.nextInt(3);
        System.out.println("you choose- "+a);

        Random random = new Random();
        int b = random.nextInt(3);
        System.out.println("AI choose- "+b);

        if(a==0&&b==0||a==1&&b==1||a==2&&b==2){
            System.out.println("Match is draw! play next round");
        } else if (a==0&&b==2||a==2&&b==1) {
            System.out.println("You Win");
        }
        else{
            System.out.println("You lose!");}
    }
}
