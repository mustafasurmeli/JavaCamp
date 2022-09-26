public class Main {
    public static void main(String[] args) {
        findingNum();

    }
    public static void findingNum(){
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int search = 5;
        boolean Is = false;

        for (int num : numbers) {
            if (num == search) {
                Is = true;
                break;
            }
        }
        String msg ="";
        if (Is) {
            msg = "Number is exists : " +search;
            giveMsg(msg);
        } else {
            System.out.println("Number isn't exists : " +search);
        }

    }
    public static void giveMsg(String msg){
        System.out.println(msg);
    }
}