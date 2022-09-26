public class Main {
    public static void main(String[] args) {
        int num1 = 266;
        int num2 = 25;
        int num3 = 26;
        int largest = num1;

        if (largest < num2) {
            largest = num2;
        }  if (largest < num3) {
            largest = num3;
        }
        System.out.println("Largest number is:" + largest);
    }
}