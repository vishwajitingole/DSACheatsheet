package F1__Mathematics;

import java.util.Scanner;


public class p7_LCM {

    public static void LCM(int a,int b){
        int max = Math.max(a, b);
        
        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println(max);
                break;
            }
            max++;
        }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        LCM(a,b);
    }
}
