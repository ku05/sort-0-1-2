import java.util.*;
class binary_search{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the array :");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the value of search data :");
        int data=sc.nextInt();
        int n=a.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(data==a[mid]){
                System.out.println("Index is :"+mid);
                break;
            }else if(data<a[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        if(l>r){
            System.out.println("number is not found");
        }
        
    }
}