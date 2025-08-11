package F8___Strings;

public class p12_LargestOddNumber {
    public static String larg(String s){
        int j=-1;
        for(int i=s.length()-1;i>=0;i--){
            if((s.charAt(i)-'0')%2==1){
                j=i;
                break;
            }
        }
        if(j==-1)return "";
        int i=0;
        for(int k=0;k<=j;k++){
            if(s.charAt(k)!='0'){
                i=k;
                break;
            }
        }

        return s.substring(i, j+1);
    }

   
    public static void main(String arg[]){
String s="002334430";

    }
}
