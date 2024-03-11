import java.util.*;

class DistinctTriplets 
{
    static void findTriplets(int arr[], int N) 
    {
        int count = 0;

        for (int i = 0; i < N - 2; i++) 
        {
            for (int j = i + 1; j < N - 1; j++) 
            {
                for (int k = j + 1; k < N; k++) 
                {
                    if (arr[i] + arr[j] + arr[k] == 0) 
                    {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        count++;
                    }
                }
            }
        }

        System.out.println("No. of triplets: " + count);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        System.out.print("Enter elements of array: ");
        for (int i = 0; i < N; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array: ");
        for (int i = 0; i < N; i++) 
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nTriplets are:");
        findTriplets(arr, N);
    }
}
