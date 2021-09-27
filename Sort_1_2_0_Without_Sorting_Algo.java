// Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

package Learning;

import java.util.Scanner;

class Sort_1_2_0_Without_Sorting_Algo {
    void Display(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.printf("arr[%d]=%d \n ",i,arr[i]);
        }
    }

    public static void main(String[] args) {
        Sort_1_2_0_Without_Sorting_Algo obj=new Sort_1_2_0_Without_Sorting_Algo();
        int zero=0;
        int first=0;
        int two =0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Number of Element to be present in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Element to be inserted:");
            arr[i]=sc.nextInt();

        }
        obj.Display(arr,n);
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                zero=zero+1;
            }
            else if(arr[i]==1)
            {
                first=first+1;

            }
            else if(arr[i]==2)
            {
                two=two+1;
            }

        }
        for(int i=0;i<zero;i++)
        {
            System.out.print("0,");
        }
        for(int i=0;i<first;i++)
        {
            System.out.print("1,");
        }
        for(int i=0;i<two;i++)
        {
            System.out.print("2,");
        }



    }
}
