package F8___Strings;

public class p10_maxValueString {
    public static void main(String[] args) {
        String str[] = { "1", "Hello", "2", "Vishwajit" };
        //So here What we are going to do is
        //We will iterate all the string elements and stores max int 
        //incase if the elements is not an integer we will consider it's length
        max(str);
    }

    public static void max(String[] strs) {
        int max = 0;
        int curr = 0;
        for (int i = 0; i < strs.length; i++) {
            try {
                curr = Integer.parseInt(strs[i]);
            } catch (Exception e) {
                curr = strs[i].length();
            }
            if (curr > max) {
                max = curr;
            }
        }
        System.out.println(max);
    }  
}
