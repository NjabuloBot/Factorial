import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
        factorial facValue = new factorial();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter factorial number: ");
        int input = scan.nextInt();
        facValue.recurFunction(input);
        System.out.println("Factorial of "+input+" is "+facValue.factorialValue);
        scan.close();
    }
}
