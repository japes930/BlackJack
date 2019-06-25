import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the first card?");
        int card1 = keyboard.nextInt();
        System.out.println("What is the second card?");
        int card2 = keyboard.nextInt();
        addCards(card1,card2);

    }

    private static void addCards(int x, int y){
        int sum = x + y;
        if (sum==21){
            System.out.println(sum + "*");
        } else {
            System.out.println(sum);
        }
    }
}
