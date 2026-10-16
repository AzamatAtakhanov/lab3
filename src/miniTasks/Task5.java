package miniTasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;
        do{
            System.out.println(i++);
        }while (i <= n);

        sc.close();
    }
}
