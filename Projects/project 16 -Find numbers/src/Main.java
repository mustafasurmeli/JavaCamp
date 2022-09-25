public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int search = 5;
        boolean Is = false;

        for (int num : numbers) {
            if (num == search) {
                Is = true;
                break;
            }
        }

        if (Is){
            System.out.println("Number exists");
        }else {
            System.out.println("Number isn't exists");
        }
    }
}