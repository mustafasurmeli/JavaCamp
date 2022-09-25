public class Main {
    public static void main(String[] args) {
       int num = -2;
       int reminder = num % 2;
       System.out.println(reminder);
       boolean isPrime = true;

       if (num == 1){
           System.out.println("Number isn't prime");
           return;
       }

       if (num<1){
           System.out.println("Invalid number");
           return;
       }

        for (int i = 2; i <num ; i++) {
            if (num % i == 0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("Number is prime.");
        }else {
            System.out.println("Number isn't prime.");
        }
    }
}