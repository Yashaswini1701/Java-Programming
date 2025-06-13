public class SumOfAllElements{
    public static void main(String[] args){
        int[] arr={5,6,4,3,2,1};
        int sum = 0;
        for (int num : arr){
            sum +=num;
        }
        System.out.println("The sum of all array elements:"+sum);
    }
}