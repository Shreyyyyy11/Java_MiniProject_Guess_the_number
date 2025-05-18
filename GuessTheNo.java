import java.util.Scanner;
import java.util.Random;
class game{
    public int number;
    public int gnum;
    public game(){
        Random r= new Random();
   this.number=r.nextInt(100);
    }
   public void takeuserinput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your guess(Between 0-100):");
        gnum=sc.nextInt();
    }
   public Boolean isCorrectNumber() {
if (number==gnum){
    System.out.println("You guessed it right!!");
    return true;
}
else if(number>gnum){
    System.out.println("Too low!!");
       }
else if(number<gnum){
    System.out.println("Too high!!");
}
return false;
   }

}

public class GuessTheNo {
    public static void main(String[] args) {
   game g=new game();
   boolean b=false;
   while (!b){
       g.takeuserinput();
       b= g.isCorrectNumber();
       System.out.println(b);
   }

    }
}
