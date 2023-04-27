import java.util.*;
class median_different{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n for first array :");
        int n=sc.nextInt();
        System.out.println("Enter the value of m for second array :");
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        System.out.println("Enter the first array :");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the second array :");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int c[]=new int[n+m];
        int j=0;
        for(int i=0;i<n;i++){
            c[j]=a[i];
            j++;
        }
        for(int i=0;i<m;i++){
            c[j]=b[i];
            j++;
        }
        for(int k=0;k<(n+m)-1;k++){
            for(int i=k+1;i<(n+m);i++){
                if(c[i]<c[k]){
                    int swap=c[k];
                    c[k]=c[i];
                    c[i]=swap;
                }
            }
        }
        int median;
        if((n+m)%2==0){
            median = (c[(n+m)/2] + c[(n+m)/2-1])/2;
        }else{
            median=c[(n+m)/2];
        }
        System.out.println("meadian is " + median);
    }
}