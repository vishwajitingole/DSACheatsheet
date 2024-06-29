package F8_Strings;

public class p4_ShortestPathfromOrigin {
    public static void main(String[] args) {
        String path = "WNEESENNN";
        System.out.println(spath(path));
    }

    public static float spath(String p) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < p.length(); i++) {
            char dir = p.charAt(i);
            if (dir == 'W') {
                x--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            }
        }
        //Sqrt of (x2-x1)^2+(y2-y1)^2
        float ans=(float)Math.sqrt(x*x+y*y);
        return ans;
    }
}
