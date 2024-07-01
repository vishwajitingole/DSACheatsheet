package F8___Strings;

public class p9_rotateConfirm {
    //We will give two strings to a function and  check whether the rotation was done or not
    
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "lloHe";
        boolean res = verify(str1, str2);
        if (!res) {
            System.out.println("Not a rotation of each other");
        } else {
            System.out.println("Rotation of each other");
        }

    }

    public static boolean verify(String str1, String str2) {
        return str1.length() == str2.length() && (str1 + str1).contains(str2);
    }
}
