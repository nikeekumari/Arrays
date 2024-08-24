import java.util.Arrays;
public class twoSum {
   static boolean printPairs(int arr[],int n,int sum){
    int l,r;
    Arrays.sort(arr);
     l=0;
     r=n-1;
while(l<r){
    if(arr[l]+arr[r]==sum)
    return true;
   if(arr[l]+arr[r]<sum)
    l++;
    else
    r--;
}
return false;
   }
public static void main(String[] args){
    int arr[]={0,-1,2,-3,1};
    int n=arr.length;
    int sum=-2;
 System.out .println(printPairs(arr,n, sum));
}

}
   

