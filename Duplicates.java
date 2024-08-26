
import java.util.List;
import java.util.ArrayList;
public class Duplicates {
    public static List<Integer> findDuplicates(int[] nums){
        int n=nums.length;
        int[] arr=new int[n];
        List<Integer> list=new ArrayList<>();
for(int i: nums){
    if(++arr[i]>1)
    list.add(i);
}
return list;
    }
    public static void main(String[] args){
        Duplicates d=new Duplicates();
        int[] nums={1,2,3,6,3,6,1};
        List<Integer> list  = Duplicates.findDuplicates(nums);
        System.out.print("Duplicate elements are: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: Duplicate elements
                              // are: 2 3
    }
}
    


