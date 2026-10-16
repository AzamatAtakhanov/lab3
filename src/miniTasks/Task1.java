package miniTasks;

public class Task1 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 1000){
            System.out.println("Before: " + i + " After: " + (i*=10));
        }
    }
}
