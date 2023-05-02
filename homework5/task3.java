// Реализовать алгоритм пирамидальной сортировки (HeapSort).

package homework5;

public class task3 
{
    public static void main(String[] args) 
    {
        int arr[] = {8, 6, 9, 5, 1};
        int len = arr.length;
        task3 sor = new task3();
        sor.sort(arr);
        System.out.println("После сортировки:");
        printArray(arr);
    }

    public void sort(int arr[])
    {
        int len = arr.length;
        for (int i = len / 2 - 1; i >= 0; i--)
        {
            heapify(arr, len, i);
        }    

        for (int i = len - 1; i >= 0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public void heapify(int arr[], int len, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        
        if(l < len && arr[l] > arr[largest])
        {
            largest = l;
        }

        if(r < len && arr[r] > arr[largest])
        {
            largest = r;
        }

        if(largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] =  swap;

            heapify(arr, len, largest);
        }
    }

    public static void printArray(int arr[])
    {
        int len = arr.length;
        for (int i = 0; i < len; ++i)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
