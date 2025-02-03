import java.util.Scanner;
public class Input{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");//Prompting user to input their name
        String name;
        name = scanner.nextLine();
        System.out.print("Enter your age: ");//Prompting user to input their age
        int age;
        age = scanner.nextInt();
        System.out.print("Enter your weight: ");//Prompting user to input their weight
        double weight;
        weight = scanner.nextDouble();
        System.out.print("Do you smoke? True/False: ");//Prompting user to input if they smoke or not
        boolean smoker;
        smoker = scanner.nextBoolean();
        System.out.print("\nYour name is " + name + ", " + age + " years old, " + "who weights " + weight + ", and smoker:" + smoker);//Displaying the user's information


    }
}
