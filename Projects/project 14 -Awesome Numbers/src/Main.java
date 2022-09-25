public class Main {
    public static void main(String[] args) {
        int num = 6;
        int total = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                total += i;
            }
        }

        if (total == num) {
            System.out.println("It is awesome number");
        } else {
            System.out.println("It isn't awesome number");
        }
    }
}