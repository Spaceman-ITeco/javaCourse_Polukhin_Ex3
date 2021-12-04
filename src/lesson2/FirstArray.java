package lesson2;

public class FirstArray {
    public static void main(String[] args) {
        int array[] = new int[]{3, 22, 1, 13, 4, 6, 16, 5};


        System.out.println(array[0]);
        System.out.println("Even elements of array: ");
        for(int i=0;i<array.length;i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + " ");
        }
        System.out.println("\nDouble-digit elements of array:");
        for(int i=0;i<array.length;i++){
            if(array[i]>=10 && array[i]<=99 )
                System.out.print(array[i] + " ");
        }
        int maxNum = array[0];
        for (int j : array) {
            if (j > maxNum)
                maxNum = j;
        }
        System.out.println("\nMax element of array: \n" + maxNum);
        int sum = 0;
        for(int i=0;i<array.length;i++)
        {
            sum += array[i];
        }
        System.out.println("Sum all elements of array: \n" + sum);

        System.out.println("Reverse array for first: ");
        int n = array.length;
        int arrayReverse [] = new int[n];
        int c = n;
        for(int i=0;i<array.length;i++)
        {
            arrayReverse[c-1]= array[i];
            c = c - 1;
            System.out.print(arrayReverse[c] + " ");
        }


    }
}
