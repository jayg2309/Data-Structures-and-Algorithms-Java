import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        while(n !=0){
            temp = n %10;
            System.out.println(temp);
            n=n/10;
        }
        sc.close();
    }
}
