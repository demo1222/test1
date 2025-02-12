import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int i = 0;

        System.out.println(Arrays.toString(nums));
        for(int x:nums){
            System.out.println("Before: " + i);
            x=i++;
            System.out.println("After: " + i);
            System.out.println("x= "+x + " ");

        }

    }
}

