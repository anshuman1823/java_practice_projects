import java.util.Scanner;

class bubbleSort{

    public static void main(String[] args) {
        
        //Taking array input
        System.out.println("Enter the size of the array which you want to sort in ascending order using bubble sort technique: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        //Array elements input one by one
        System.out.println("Enter the elements of the array one by one: ");
        for(int i = 0; i < n; i++ ){
            arr[i] = sc.nextInt();
        }

        //Bubble sort
        int swapCounter = 0; //counter for swaps
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                else{
                    continue;
                }
                swapCounter++;
            }
        }

        //Sorted array output
        System.out.print("Sorted array: ");
        for(int i = 0; i < n; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Swap counter: " + swapCounter);


    }


}