import java.util.*;
class reverse_group{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        System.out.println("Enter the array :");
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k :");
        int k=sc.nextInt();
        int n=a.length;
        for(int i=0;i<n;i=i+k){
            int start=i;
            int end=Math.min(i+k-1,n-1);
            while(start<=end){
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
        }
        System.out.println("Array is :");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}