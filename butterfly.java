import java.util.*;

class butterfly{
    public static void main(String[] args) {
        System.out.println("Enter n for butterfly pattern!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            for(int x=1; x <= n - i; ++x){
                System.out.print(" ");
            }
            for(int x=1; x<= n; ++x){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}