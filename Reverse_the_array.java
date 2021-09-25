//
//
//Reversing an array in java can be done in three simple methods.
//        Examples:
//
//        Input : 1, 2, 3, 4, 5
//        Output :5, 4, 3, 2, 1
//
//        Input :  10, 20, 30, 40
//        Output : 40, 30, 20, 10

package Learning;

import java.util.Scanner;

class Reverse_the_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Number of Element to be present in the array");
        int n=sc.nextInt();
        int myarr[]=new int[n];
        int reversearr[]=new int[n];     // For reverse array
//*********************** Loop for inserting element in the array*****************************
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Element to be inserted:");
            myarr[i]=sc.nextInt();

        }
//************************************* Loop to display the Elements**************************************
        for(int i=0;i<n;i++)
        {
            System.out.printf("arr[%d]=%d \n ",i,myarr[i]);
        }
        int j=n-1;
        for(int i=0;i<n;i++){

            reversearr[i]=myarr[j];
            j=j-1;
        }
//        "*************************Reverse Array Printing *******************")
        System.out.println("*************************Reverse Array*******************");
        for(int i=0;i<n;i++)
        {
            System.out.printf("arr[%d]=%d \n ",i,reversearr[i]);
        }




    }



}
