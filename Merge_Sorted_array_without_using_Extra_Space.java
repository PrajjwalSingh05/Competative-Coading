package Learning;
import java.util.Arrays;

class Merge_Sorted_array_without_using_Extra_Space {
    void Display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("arr[%d]=%d \n ", i, arr[i]);
        }
    }
    public static void main(String[] args) {
        Merge_Sorted_array_without_using_Extra_Space obj=new Merge_Sorted_array_without_using_Extra_Space();

        int arr[]={1,2,4,6,12,13,14,15};
        int arr2[]={3,5,7,9,10,11,17};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr2[0])
            {
                arr[i]=arr[i]+arr2[0];
                arr2[0]=arr[i]-arr2[0];
                arr[i]=arr[i]-arr2[0];
                Arrays.sort(arr2);

            }
        }
        obj.Display(arr);
        System.out.println("*********************************************");
        obj.Display(arr2);

    }
}
