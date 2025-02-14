    //This is a java program to sort numbers using randomized quick sort
    // link https://www.sanfoundry.com/java-program-implement-quick-sort-randomization/

    import java.util.Random;

     

    public class Randomized_Quick_Sort 

    {

        public static int N = 10;

        public static int[] sequence = new int[N];

     

        public static void QuickSort(int left, int right) 

        {

            if (right - left <= 0)

                return;

            else 

            {

                Random rand = new Random();

                int pivotIndex = left + rand.nextInt(right - left + 1);

                swap(pivotIndex, right);

                int pivot = sequence[right];
		System.out.println(" Pivot = " + pivot);

                int partition = partitionIt(left, right, pivot);

                QuickSort(left, partition - 1);
	        printSequence(sequence);

                QuickSort(partition + 1, right);
 	        printSequence(sequence);
            }

        }

     

        public static int partitionIt(int left, int right, long pivot) 

        {

            int leftPtr = left - 1;

            int rightPtr = right;

            while (true) 

            {

                while (sequence[++leftPtr] < pivot)

                    ;

                while (rightPtr > 0 && sequence[--rightPtr] > pivot)

                    ;

     

                if (leftPtr >= rightPtr)

                    break;

                else

                    swap(leftPtr, rightPtr);

            }

            swap(leftPtr, right);

            return leftPtr;

        }

     

        public static void swap(int dex1, int dex2) 

        {

            int temp = sequence[dex1];

            sequence[dex1] = sequence[dex2];

            sequence[dex2] = temp;

        }

     

        static void printSequence(int[] sorted_sequence) 

        {
	    System.out.println();
            for (int i = 0; i < sorted_sequence.length; i++)

                System.out.print(sorted_sequence[i] + " ");

        }

     

        public static void main(String args[]) 

        {

            System.out.println("Sorting of randomly generated numbers using RANDOMIZED QUICK SORT");

            Random random = new Random();

     

            for (int i = 0; i < N; i++)

                sequence[i] = Math.abs(random.nextInt(100));

     

            System.out.println("\nOriginal Sequence: ");

            printSequence(sequence);

            System.out.println("\nSorted Sequence: ");

            QuickSort(0, N - 1);

            printSequence(sequence);

        }

    }
//time complexity: O(n Log n)
//space Complexity:  O(log n)
