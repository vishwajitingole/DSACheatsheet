package F8___Strings;

public class p7_substring {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.substring(0, 4));

        String fruits[] = { "apple", "mango", "banana" };
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        
        
    }
}
