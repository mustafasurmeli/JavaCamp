public class Main {
    public static void main(String[] args) {
        String msg = "Today weather is very nice .";
        String newmsg = City();
        System.out.println(newmsg);
        int num = gather(15,7);
        System.out.println(num);
        int total = gather2(2,3,4,5,6,10);
        System.out.println(total);
    }

    public static void add(){
        System.out.println("Added");
    }

    public static void remove(){
        System.out.println("Removed");
    }

    public static void update(){
        System.out.println("Updated");
    }

    public static int gather(int num1, int num2){
        return num1+num2;
    }

    public static String City(){
        return "Bayburt";
    }
    public static int gather2(int... nums){
        int total =0;
        for (int num : nums){
           total += num;
        }

        return total;
    }
}