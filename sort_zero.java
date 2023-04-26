import java.util.*;
class sort_zero{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int [6];
        System.out.println("Enter the array :");
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();
        }
        int n=a.length;
        int start=0,end=n-1,i=0;
        while(i<=end){
            if(a[i]==0){
                int swap=a[i];
                a[i]=a[start];
                a[start]=swap;
                i++;
                start++;
            }else if(a[i]==2){
                int swap=a[i];
                a[i]=a[end];
                a[end]=swap;
                end--;
            }else{
                i++;
            }
            
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}