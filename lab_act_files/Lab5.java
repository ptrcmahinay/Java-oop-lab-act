

import java.util.Scanner;
public class Lab5 {
    private double n1;
    private double n2;
    private double n3;
    private double n4;
    private double n5;

    public Lab5(double n1, double n2, double n3, double n4, double n5) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
    }

    public void oddEven(){
        double average = (n1 + n2 + n3 + n4 + n5) / 5;

        if (average % 2 == 0){
            System.out.println(average + " is Even");
        } else{
            System.out.println(average + " is Odd");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        double a = input.nextDouble();

        System.out.println("Enter number 2: ");
        double b = input.nextDouble();
        
        System.out.println("Enter number 3: ");
        double c = input.nextDouble();

        System.out.println("Enter number 4: ");
        double d = input.nextDouble();

        System.out.println("Enter number 5: ");
        double e = input.nextDouble();

        Lab5 ob = new Lab5(a, b, c, d, e);
        ob.oddEven();

        input.close();
    }
}
