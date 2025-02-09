package F3_Array;

import java.util.HashMap;

public class p29_countNumOfBadPairs {
    public static void count(int arr[]){
        int n=arr.length;
        //Jyaada se jyaada itne pair ho sakte array ke kaide se
        long totalPairs=n*(n-1)/2;
        HashMap<Integer, Integer> freq = new HashMap<>();
         //Ek accha pair wo hota hai jo 
        // arr[j] - arr[i]== j - i;
        //But hum  thoda herrr pherrrr karenge ki iska udhar aur udhar kaa idhar
        //arr[j] - j == arr[i] - i;
        //Ye bhi ek good pair property ho sakti aisa isliye kiya kyuki at a time ek hi value traverse kar rhe hai 
        // ek time pe do value access nhi kar rhe isliye
        long goodPairs=0;
        for(int i=0;i<n;i++){
            int diff=arr[i]-i;
            //Main yaa toh ye neeche ki line use kar sakta yaa fir uske neeche kaa if 
            //Donno same hi kaam karega
            // goodPairs+=freq.getOrDefault(diff,0 ); 
            if(freq.containsKey(diff)){
                goodPairs+=freq.get(diff);
            }

            // Main yaa toh ye neeche ki line use kar sakta yaa fir neeche kaa if else statement
            // freq.put(diff,freq.getOrDefault(diff, 0)+1);
            if(freq.containsKey(diff)){
                freq.put(diff,freq.get(diff)+1);
            }else{
                freq.put(diff,1);
            }


        }
        System.out.print(totalPairs-goodPairs);



    }
    public static void main(String[] args) {
        int arr[]={4,1,3,3};
       
        count(arr);
    }
}
