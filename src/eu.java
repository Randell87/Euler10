//Сумма простых чисел меньше 10 равна 2 + 3 + 5 + 7 = 17.
//Найдите сумму всех простых чисел меньше двух миллионов.
import java.util.*;
public class eu {
    public static void main(String[] args) {
        long sum=0L;
        ArrayList<Integer> nums = new ArrayList<>();
        //nums.add(1);
        int count = 0;
        for(int i =1; i<2000000; i++){
            for(int j=1; j<i; j++){
                if ((i%j)==0){
                    count++;
                }
                if(count>1){
                    count=0;
                    break;
                }

            }
            if (count == 1) {
                nums.add(i);
                System.out.println(i);
                count = 0;}
            else count = 0;

        }
        for (Integer i : nums) {
            sum=sum+i;
        }
        System.out.println(sum);
        System.out.println(nums.size());
    }
}
