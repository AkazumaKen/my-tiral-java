import java.util.Scanner;

public class bio {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age= scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);


       
        scanner.close();
    }
    
}
