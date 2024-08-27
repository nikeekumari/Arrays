class productArray{
   void  prodArray(int[] arr,int n){
        if(n==1){
            System.out.println(0);
            return ;
        }
        //initialize memory for each array
        int left[]=new int[n];
        int right[]=new int[n];
        int prod[]=new int[n];
        int i ,j;
        left[0]=1;
     right[n-1]=1;
for(i=1;i<n;i++)
    left[i]=arr[i-1]*left[i-1];
    for(j=n-2;j>=0;j--)
    right[j]=arr[j+1]*right[j+1];
    for(i=0;i<n;i++)
    prod[i]=left[i]*right[i];
    for(i=0;i<n;i++)
    System.out.print(prod[i]+" ");
    return ;
}
public static void main(String[] args){
    productArray pa=new productArray();
    int[] arr={10,3,5,6,2};
    int n=arr.length;
    System.out.println("The product array Except self is:");
    pa.prodArray(arr,n);
}

}


    
