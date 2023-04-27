import java.util.*;
class minimum_operations_pallendrome{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a[]=new int[4];
        System.out.println("Enter the array");
        for(int i=0;i<4;i++){
            a[i]=sc.nextInt();
        }
        int ans=0;
        int n=a.length;
        for(int i=0,j=n-1;i<=j;){
            if(a[i]==a[j]){
                i++;
                j--;
            }else if(a[i]>a[j]){
                j--;
                a[j]+=a[j+1];
                ans++;
            }else{
                i++;
                a[i]+=a[i+1];
                ans++;
            }
        }
        System.out.println("operations performed is :" + ans);
    }
}