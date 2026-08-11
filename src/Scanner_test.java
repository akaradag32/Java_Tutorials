import java.util.Scanner;

public class Scanner_test {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        
        System.out.print("Enter your age    : ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();
        System.out.println("Hello, " + name + "!" + age + "!" + favoriteColor);
        scanner.close();
    }
}
