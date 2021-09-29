//
//
//Given an array, cyclically rotate the array clockwise by one.
//
//        Examples:
//
//        Input:  arr[] = {1, 2, 3, 4, 5}
//        Output: arr[] = {5, 1, 2, 3, 4}

package Learning;

import java.util.Scanner;

class Cyclically_Rotate_by_one {
//    *******************Method to display All the Element of the array****************
    void Display(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.printf("arr[%d]=%d \n ",i,arr[i]);
        }
    }

    public static void main(String[] args) {
        Cyclically_Rotate_by_one  obj=new Cyclically_Rotate_by_one();
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of Element to be present in the array");
        int n=sc.nextInt();

        int arr[]=new int[n];
//        ************************Loop for Inserting Element is the array**************************
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Element to be inserted:");
            arr[i]=sc.nextInt();

        }
        obj.Display(arr,n);
//        #************************Main*********************
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println("***************************Array after rotating by one ************************");
        obj.Display(arr,n);

        }
}
