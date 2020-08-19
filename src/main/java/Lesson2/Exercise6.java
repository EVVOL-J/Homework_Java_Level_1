package Lesson2;

public class Exercise6 {//** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    // граница показана символами ||, эти символы в массив не входят.
    public static void main(String[] args) {
        int arr1[]={2, 2, 2, 1, 2, 2, 10, 1};
        int arr2[]={2, 2, 2, 1, 2, 2, 10, 5};
        System.out.println(checkBalance(arr1));
        System.out.println(checkBalance(arr2));

    }
    private static boolean checkBalance(int arr[]){

        int leftSum=arr[0];
        int rightSum=arr[arr.length-1];
        int i=0, j=arr.length-1;
        while(i+1!=j)
        {
            if(leftSum<=rightSum)
                {   i++;
                leftSum+=arr[i];
                }
            else
                {j--;
                rightSum+=arr[j];
                }
        }

        return leftSum==rightSum;


    }
}
