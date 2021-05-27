public class Main{
    public static void main(String[] args) {
        // write your code her
        int [] numbers = {10,23,45,6,8,18,4,5};
        int sum=0;

        for(int i=0;i<numbers.length;i++){
           sum=sum+numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            System.out.println("my array's element is "+numbers[i]);
        }
        System.out.println("Sum of array is "+ sum);
    }
}