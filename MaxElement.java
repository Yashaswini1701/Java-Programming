public class MaxElement{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,67};
        int max = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element in an Array:"+max);
    }
}