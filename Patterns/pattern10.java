import java.util.Scanner;       
public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int os = n/2;
        int is= -1;

        for(int i=1;i<=n;i++){
//            System.out.println(os+","+is);
            for(int j=1;j<=os;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            
            for(int j=1;j<=is;j++){
                System.out.print(" ");
            }

            if(i>1 && i<n){
                System.out.print("*");
            }

            if(i<= n/2){
                os--;
                is+=2;
            }else{
                os++;
                is-=2;
            }
            System.out.println();
        }
        sc.close();
    }
}


// input n=5
//output
//    *
//   * *
//  *   *
//   * *
//    *