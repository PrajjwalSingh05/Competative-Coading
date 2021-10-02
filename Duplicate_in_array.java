import java.util.Scanner;

public class Duplicate_in_array {
    void Display(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.printf("arr[%d]=%d \n ",i,arr[i]);
        }
    }

    public static void main(String[] args) {
        Duplicate_in_array obj=new Duplicate_in_array();
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of element to be Inserted:");
        int n=sc.nextInt();
        int [] arr = new int [n];
//          ************************Loop for Inserting Element is the array**************************
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Element to be inserted:");
            arr[i]=sc.nextInt();

        }
        obj.Display(arr,n);

        System.out.println("Duplicate elements in given array: ");
        //***************************Searches for duplicate element*********************************
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}