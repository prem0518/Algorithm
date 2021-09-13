/*
*Pseudocode
*Sorting an array
* for i =1 to n
*   key<-a[i]
*   j<-i-1
*   while j>=0 and a[j]>key
*       a[j+1]<-a[j]
*   End while
*   a[j+1] <- key
* End for
*/

public class InsertionSort
{
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = {83,1,45,95,45,52,11,47,0,45,67,82};
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArray(arr);
    }
}
