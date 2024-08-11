import java.util.Random;
import java.util.Scanner;
public class guesse_number {
    public static void main(String[] args) {
        guesse_game game1= new guesse_game();
        game1.yourguessse();

    }
    
}
class guesse_game{
    int computer;
    public guesse_game() {
        Random random=new Random();
        this.computer=random.nextInt(1,101);
        
    }
    public void  yourguessse(){
        Scanner sc=new Scanner(System.in);
        int turn=0;
        while(true){
            System.out.print("your choice: ");
            int mychoice=sc.nextInt();
            if(mychoice==this.computer){
                System.out.println("correct!");
                System.out.println("Total turn: "+ turn);
                turn++;
                break;
            }else if(this.computer>mychoice){
                System.out.println("Guesse more bigger number!");
                turn++;
            }else if(this.computer<mychoice){
                System.out.println("Guesse more smaller number!");
                turn++;
            }
            
        }
    }
    

}