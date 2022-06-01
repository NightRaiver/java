// Написать программу вычисления n-ого треугольного числа.

import java.util.Scanner;

public class program2
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println(sum);
        }
        in.close();
    }
}