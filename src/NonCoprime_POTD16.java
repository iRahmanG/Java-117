import java.util.ArrayList;
import java.util.List;

public class NonCoprime_POTD16 {
    public static List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            int gcd=gcd(nums[i],nums[i+1]);
            if(gcd>1){
                int lcm = Math.abs(nums[i]*nums[i+1])/gcd;
                list.add(lcm);
                nums[i+1]=lcm;
            }
            else
                list.add(nums[i]);
        }
        return list;
    }
    static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println(replaceNonCoprimes(new int[]{6, 4, 3, 2, 7, 6, 2}));
    }
}

