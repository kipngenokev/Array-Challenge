import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myFirstSet=generateRandomIntegers(5);
        System.out.println(Arrays.toString(myFirstSet));
        Arrays.sort(myFirstSet);
        System.out.println(Arrays.toString(myFirstSet));
    }

    public static int[] generateRandomIntegers(int length){
        Random random =new Random();
        int[] myIntArray=new int[length];

        for(int i=0;i<length;i++){
            myIntArray[i]=random.nextInt(100);
        }
        return myIntArray;
    }
}