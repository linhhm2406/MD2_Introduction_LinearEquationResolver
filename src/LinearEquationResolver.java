import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        double a;
        double b;

        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Giai phuong trinh bac nhat ax+b=0");

        System.out.print("Nhap so a : ");
        a = inputNumber.nextDouble();

        System.out.print("Nhap so b : ");
        b = inputNumber.nextDouble();

        if(a == 0){
            if (b==0){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double result = -b/a;
            System.out.printf("Equation pass with x = %f!\n", result);
        }
    }
}
