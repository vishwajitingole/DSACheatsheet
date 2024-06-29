package F8_Strings;

public class p6_compare {
    public static void main(String[] args) {
        String a = "Vishwajit";
        String b = "Vishwajit";
        String c = new String("Vishwajit");

        //Memory address is same for both of them
        if (a == b) {
            System.out.println(" a and b are equal");
        } else {
            System.out.println("a and b aren't equal");
        }

        //c is an Object which stored in heap
         if (a == c) {
            System.out.println(" a and c are equal");
        } else {
            System.out.println("a and c aren't equal");
        }

        //An actual elements are compared 
         if (a.equals(c)) {
            System.out.println(" a and b are equal");
        } else {
            System.out.println("a and b aren't equal");
        }

    }
}
