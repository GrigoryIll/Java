package homework3;

import java.util.Arrays;

public class task1 
{
    public static void main(String[] args) 
    {
        int[] array1 = {1, 6, 35, 80, 2, 19};
        System.out.println("Изначальный массив: ");
        System.out.println(Arrays.toString(array1));

        mergeSort(array1, 0, array1.length - 1);
        System.out.println("Осортированный массив:");
        System.out.println(Arrays.toString(array1));
    }

    public static void mergeSort(int[] array1, int left, int right)
    {
        if (left < right)
        {
            int mid = (left + right) / 2;
            mergeSort(array1, left, mid);
            mergeSort(array1, mid + 1, right);
            merge(array1, left, mid, right);
        }
    }

    public static void merge(int[] array1, int left, int mid, int right)
    {
        int leftLeng = mid - left + 1;
        int rightLeng = right - mid;
        int leftArray[] = new int [leftLeng];
        int rightArray[] = new int [rightLeng];

        for (int i = 0; i < leftLeng; i++)
        {
            leftArray[i] = array1[left + i];
        }

        for (int i = 0; i < rightLeng; i++)
        {
            rightArray[i] = array1[mid + i + 1];
        }

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++)
        {
            if (leftIndex < leftLeng && rightIndex < rightLeng)
            {
                if (leftArray[leftIndex] < rightArray[rightIndex])
                {
                    array1[i] = leftArray[leftIndex];
                    leftIndex++; 
                }
                else
                {
                    array1[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            else if (leftIndex < leftLeng)
            {
                array1[i] = leftArray[leftIndex];
                leftIndex++;
            }
            else if (rightIndex < rightLeng)
            {
                array1[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
