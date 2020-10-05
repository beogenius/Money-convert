import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000, vnd, usd;
        System.out.println("Please enter your usd");
        usd = scanner.nextInt();
        vnd = usd * rate;
        System.out.println("Your money in VND is : " + vnd);

    }
}
