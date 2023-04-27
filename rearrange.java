import java.util.*;
class rearrange{
    public static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        System.out.println("Enter the array :");
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();
        }
        int i=0;
        int j=6-1;
        while(i<j){
            while(i<6 && a[i]>0)
            i++;
            while(j>=0 && a[j]<0)
            j--;
            if(i<j)
            swap(a,i,j);
        }
        if(i==0 || i==6)
        return;
        int k=0;
        while(k<6 && i<6){
            swap(a,k,i);
            i++;
            k=k+2;
        }
        System.out.println("After rearrange the element :");
        for(i=0;i<6;i++){
            System.out.print(a[i]+" ");
        }
    }
}