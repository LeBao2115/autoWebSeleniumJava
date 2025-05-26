package JavaBasic.Exercise4;

import java.util.Arrays;

public class Loop {
    public static void main(String[] args) {
        int[] nums = new int[26];
        int n = 0;

        for (int i = 0; i <= 50; i++){
            if (i % 2 == 0){
                nums[n] = i;
                n ++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
