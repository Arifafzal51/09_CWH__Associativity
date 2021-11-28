import java.util.Scanner;

public class cbse_result_calculator {
    public static void main(String[] args) {
        float total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total marks of subject");
        int S1 = input.nextInt();
        System.out.println("Enter marks of English");
        int S2 = input.nextInt();
        System.out.println("Enter marks of subject Hindi");
        int S3 = input.nextInt();
        System.out.println("Enter marks of subject Physics");
        int S4 = input.nextInt();
        System.out.println("Enter marks of subject Chemistry");
        int S5 = input.nextInt();
        System.out.println("Enter marks of subject Math");
        int t= input.nextInt();
        float percentage = (S1+S2+S3+S4+S5)/500.0f*100;
        System.out.println("Percentage of student is "+percentage);
    }
}
