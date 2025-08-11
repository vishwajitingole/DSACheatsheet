package F8___Strings;

public class p11_revWords {
    public static void rev(String sentence){
        //Starting mein hi trim kardiya taaki kuch left right mein spacing hoga toh wo nikal jaayega
        // then regex se split kardiya jaha jaha wo empty space hai waha pe
       String[] words= sentence.trim().split("\\s+");
        StringBuilder res=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            
            res.append(words[i]).append(i>0?" ":"");
        }
        System.out.println(res.toString());

    }
     public static String revwords(String s){
        String res="";

      String[] parts=  s.split(res);

      for(int i=s.length()-1;i<=0;i--){
        res+=parts[i];
      }

        return res;
    }
    public static void main(String[] args) {
        rev(" Vishwajit is Name ");
        String k="Big busty woman";
System.out.println(revwords(k));
    }
}
