package Learning;

import java.util.Scanner;

class Max_And_Min_Element_Array {
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
        int max=0;
        int min=9999;

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Element to be inserted:");
            arr[i]=sc.nextInt();

        }
        obj.Display(arr,n);
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            if(min>arr[i])
            {
                min=arr[i];
            }

        }
        System.out.println("The Maximum Elemnt present in the array is:"+max);
        System.out.println("The Minimum element Present in the array is :"+min);


    }
}
