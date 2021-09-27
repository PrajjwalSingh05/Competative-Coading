package Learning;

import java.util.Scanner;

public class Negative_Element_To_One_Side {
//    *******************Method to display All the Element of the array****************
    void Display(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.printf("arr[%d]=%d \n ",i,arr[i]);
        }
    }

    public static void main(String[] args) {
        Max_And_Min_Element_Array obj=new Max_And_Min_Element_Array();
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
        int j=0;
        int temp;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                if(i !=j )
                {
                    System.out.println("changing");
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }

        }
        System.out.println("********************Printing after rearranging ********************");
        obj.Display(arr,n);
    }
}
