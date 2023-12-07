import java.util.Scanner;

class selectionSort{

    public static void main(String[] args) {
        
        //Taking array input
        System.out.println("Enter the size of the array which you want to sort in ascending order using selection sort technique: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        //Array elements input one by one
        System.out.println("Enter the elements of the array one by one: ");
        for(int i = 0; i < n; i++ ){
            arr[i] = sc.nextInt();
        }

        //Selection Sort
        for(int i = 0; i < n-1; i++){
            int smallest = i;
            for(int j = i+1; j <= n - 1; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
                else{
                    continue;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        //Sorted array output
        System.out.print("Sorted array: ");
        for(int i = 0; i < n; i++ ){
            System.out.print(arr[i] + " ");
        }


    }


}