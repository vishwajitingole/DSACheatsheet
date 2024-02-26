package F1__Mathematics;

import java.util.Scanner;

public class v {
    public static void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        add(a, b);
    }
}
