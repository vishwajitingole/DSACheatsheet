package F3_Array;

import java.util.ArrayList;

public class p13_ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(4);
        arr.add(2);
        arr.add(9);

        System.out.println(maxArea(arr));
    }

    public static int maxArea(ArrayList<Integer> a) {
        int lp = 0;
        int hp = a.size() - 1;
        int curr = 0;
        int max = 0;
        while (lp < hp) {
            int height = Math.min(a.get(lp), a.get(hp));
            int width = hp - lp;
            curr = height * width;
            max = Math.max(max, curr);

            if (a.get(lp)< a.get(hp)) {
                lp++;
            } else {
                hp--;
            }
        }
        return max;
    }
}
