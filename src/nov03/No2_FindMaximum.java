package nov03;

public class No2_FindMaximum {
    public static int findMaximum(int[] A){
        int minimum = A[0];
        for(int i =0; i<A.length; i++){
            if(minimum<A[i]){
                minimum = A[i];
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        int[] A =  {4,7,8,12,2};
        System.out.println(findMaximum(A));
    }
}
