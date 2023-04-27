import java.util.*;
class reverse_array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the array ");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Reverse order of array :");
        for(int i=4;i>=0;i--){
            System.out.println(a[i]);
        }

    }
}