import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble(); 
        double w = sc.nextDouble(); 
        double bmi = w / Math.pow(h, 2);
        double b = ((double)Math.round(bmi * 100))/100;
		System.out.println(b );

    }
}
