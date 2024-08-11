import java.util.Random;
import java.util.Scanner;

class game{
    int computer;

    public void mychoice(){
        while (true) { 
            Random random=new Random();
        computer= random.nextInt(1,4);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();

        if (choice==this.computer){
            System.out.println("Draw");
        }else if(choice==1 && this.computer==2 || this.computer==3){
            System.out.println("computer won!");
        }else if(choice>3){
            System.out.println("Enter valid credentials!");
            break;
            
        }
        else{
            System.out.println("you Won!");
        }
            
        }
}
public class Rock_paper_cissor{
    public static void main(String[] args) {
        game g1=new game();
        g1.mychoice();
    }}
}
