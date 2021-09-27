//
//
//Kadane’s Algorithm:
//
//        Initialize:
//        max_so_far = INT_MIN
//        max_ending_here = 0
//
//        Loop for each element of the array
//        (a) max_ending_here = max_ending_here + a[i]
//        (b) if(max_so_far < max_ending_here)
//        max_so_far = max_ending_here
//        (c) if(max_ending_here < 0)
//        max_ending_here = 0
//        return max_so_far

package Learning;

import java.util.Scanner;

class Largest_sum_contigoius_subarray_Kadebe_algo {
    void Display(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d]=%d \n ", i, arr[i]);
        }
    }

    public static void main(String[] args) {
        Largest_sum_contigoius_subarray_Kadebe_algo obj = new Largest_sum_contigoius_subarray_Kadebe_algo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Element to be present in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Element to be inserted:");
            arr[i] = sc.nextInt();

        }
        obj.Display(arr, n);
        int current_sum=0;
        int sum=arr[0];
        for(int i=0;i<n;i++)
        {
            current_sum=current_sum+arr[i];
            if(current_sum<0)
            {
                current_sum=0;
            }
            if(current_sum>sum)
            {
                sum=current_sum;
            }
        }
        System.out.println(sum);
    }
}