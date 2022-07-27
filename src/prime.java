import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int num= sc.nextInt();
        int flag=0;
        if(num==2)
        {
            System.out.println("2 is prime number");
        }else{
            for (int i=2;i<num;i++)
            {
                if(num%i==0){
                    flag=0;
                    break;
                }
                else {
                    flag=1;
                }
            }
            if (flag==1)
            {
                System.out.println(num+" is a prime number");
            }
            else {
                System.out.println(num+" is not a prime number");
            }
        }
    }
}
