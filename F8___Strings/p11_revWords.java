package F8___Strings;

public class p11_revWords {
    public static void rev(String sentence){
       String[] words= sentence.trim().split("\\s+");
        StringBuilder res=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            res.append(words[i]).append(i>0?" ":"");
        }
        System.out.println(res.toString());

    }
    public static void main(String[] args) {
        rev(" Vishwajit is Name ");
    }
}
