import java.util.Scanner;

public class EligibletoVote {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        age = sc.nextInt();
        if(age<18)
            System.out.println("Not eligible to vote");
        else
            System.out.println("eligible to vote");
    }
}
