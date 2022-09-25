public class Main {
    public static void main(String[] args) {
        String message = "Today weather is very nice";
        System.out.println(message);

       /*System.out.println("Number of letter : " + message.length());
        System.out.println("5th letter : " + message.charAt(4));
        System.out.println(message.concat(" Yippee!"));
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("A"));
        char[] Characters = new char[5];
        message.getChars(0,5,Characters, 0);
        System.out.println(Characters);
        System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf("c"));*/

        System.out.println(message.replace(' ', '-'));
        System.out.println(message);
        System.out.println(message.substring(2,5));
        String newMessage = message.replace(' ','-');
        System.out.println(newMessage);

        for (String word : message.split(" ")){
            System.out.println(word);
        }
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}