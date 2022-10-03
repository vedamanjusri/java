import java.util.Scanner;
public class Daysconverter {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int days,months;
        System.out.println("Enter Days:");
        days=cs.nextInt();
        months=days/30;
        int i = days;
        System.out.println("months" +months);
        System.out.println("days" +days);
        cs.close();
    }
}

