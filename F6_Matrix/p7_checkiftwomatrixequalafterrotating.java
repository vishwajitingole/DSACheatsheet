package F6_Matrix;

public class p7_checkiftwomatrixequalafterrotating {
   
    public boolean findRotation(int[][] mat, int[][] target) {
        // 4 baar isliye kyu ki 90 180 270 360 karne ke baad bhi equal nhi hua toh equal kabhi nhi hoga
       for(int i=0;i<4;i++){
        // incase agar equal hua toh thike wahi se wo true bhejega
        if(matches(mat,target)) return true;
        //in case agar fir bhi match nhi hua toh 90 degree ghuma denge
        ghumado(mat);
       }
       return false;
    }
    public boolean matches(int[][] mat,int[][] target){
        int n=target.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public void ghumado(int[][] arr){
        int n=arr.length;
        // row ko column aur column ko row mein 
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        // then reverse each row
        for(int i=0;i<n;i++){
          for(int j=0;j<n/2;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[i][n-1-j];
            arr[i][n-1-j]=temp;
          }
        }
       
    }

}
