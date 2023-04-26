import java.util.*;
class max_product{
    public static int product(int a[],int n){
        if(n==0)
        return 0;
        int res=1,max=1,min=1;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                max+=a[i];
                min=Math.min(a[i]*min,1);
            }
            else if(a[i]==0){
                max=min=1;
            }
            else{
                min+=max-(max=min);
                min*=a[i];
                max=Math.max(1,a[i]*max);
            }
            res=Math.max(max,res);
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the array :");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int n=a.length;
        System.out.println(product(a, n));
    }
}