import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range ");
        System.out.println("Start point :");
        int a=sc.nextInt();
        System.out.println("End point :");
        int b= sc.nextInt();
        int flag=0;
        if(0<=a && a<=2){
            System.out.print("prime numbers : 2 " );

        }else {
        System.out.print("prime numbers :" );}
        for(int i=a;i<=b;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
                else {
                    flag=1;
                }
            }
            if(flag==1){
                System.out.print(i+" ");
            }
        }
    }
}
