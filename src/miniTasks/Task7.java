package miniTasks;

public class Task7 {
    public static void main(String[] args) {

        // Even number
        int n = 10;
        int a = 0;
        while(a <= n){
            System.out.println(a);
            a += 2;
        }
        for(int i = 0; i <= n; i+=2){
            System.out.println(i);
        }
        a = 0;
        do{
            System.out.println(a);
            a += 2;
        }while(a<=n);

        // Odd number
        a = 1;
        while(a <= n){
            System.out.println(a);
            a += 2;
        }
        for(int i = 1; i <= n; i+=2){
            System.out.println(i);
        }
        a = 1;
        do{
            System.out.println(a);
            a += 2;
        }while(a<=n);
    }
}
