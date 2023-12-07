import java.util.*;

class hollowButterfly{
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=2*n; j++){
                if(j==1 || j==2*n || j==i || (2*n - j + 1) == i){
                    System.out.print("*");
                }
                else{
                    System.err.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--){
            for(int j = 1; j<=2*n; j++){
                if(j==1 || j==2*n || j==i || (2*n - j + 1) == i){
                    System.out.print("*");
                }
                else{
                    System.err.print(" ");
                }
            }
            System.out.println();
        }


    }
}