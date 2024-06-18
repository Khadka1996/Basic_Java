import java.util.Scanner;

class FirstClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 19) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }
        
        sc.close();
    }
}
