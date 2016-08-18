package algorithm;
import java.util.Random;


public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) {
		
		
			ConnectMongoDb mongo = new ConnectMongoDb();
			mongo.connectMongo("test");

			Random rand = new Random();
			
			int[] num = new int[15];
			for (int i = 0; i < num.length; i++) {
				num[i] = rand.nextInt(100);
				}

			
			//Selection Sort
			Sort algo = new Sort();
			algo.selectionSort(num);
			long selectionSortExecutionTime = algo.executionTime;
			System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
			algo.printSortedArray(num);
			mongo.insert("Selection Sort", selectionSortExecutionTime);
			//Insertion Sort
			int[] num2 = new int[15];

			for (int i = 0; i < num2.length; i++) {
			num2[i] = rand.nextInt(100);
			}
			algo.insertionSort(num2);
			long insertionSortExecutionTime = algo.executionTime;
			System.out.println("Total Execution Time of " + num2.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
			algo.printSortedArray(num2);

			//Bubble sort
			int[] num3 = new int[15];

			for (int i = 0; i < num3.length; i++) {
			num3[i] = rand.nextInt(100);
			}
			algo.bubbleSort(num3);
			long bubbleSortExecutionTime = algo.executionTime;
			System.out.println("Total Execution Time of " + num3.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
			algo.printSortedArray(num3);

			//Merge Sort
			int[] num4 = new int[15];

			for (int i = 0; i < num4.length; i++) {
			num4[i] = rand.nextInt(100);
			}
			algo.bubbleSort(num4);
			long mergeSortExecutionTime = algo.executionTime;
			System.out.println("Total Execution Time of " + num4.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");
			algo.printSortedArray(num4);

			//Quick Sort
			int[] num5 = new int[15];

			for (int i = 0; i < num5.length; i++) {
			num5[i] = rand.nextInt(100);
			}
			int left=0;
			int right=num5.length-1;
			algo.quickSort(num5,left,right);
			long quickSortExecutionTime = algo.executionTime;
			System.out.println("Total Execution Time of " + num5.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");
			algo.printSortedArray(num5);

			//Heap Sort
			int[] num6 = new int[15];

			for (int i = 0; i < num6.length; i++) {
			num6[i] = rand.nextInt(100);
			}
			algo.sort(num6);
			long heapSortExecutionTime = algo.executionTime;
			System.out.println("Total Execution Time of " + num6.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
			algo.printSortedArray(num6);

			//Bucket Sort
			int[] num7 = new int[15];

			for (int i = 0; i < num7.length; i++) {
			num7[i] = rand.nextInt(100);
			}
			algo.bucketSort(num7,100);
			long bucketSortExecutionTime = algo.executionTime;
			System.out.println("Total Execution Time of " + num7.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");
			algo.printSortedArray(num7);

			//Shell Sort
			int[] num8 = new int[15];

			for (int i = 0; i < num8.length; i++) {
			num8[i] = rand.nextInt(100);
			}
			algo.shellSort(num8);
			long shellSortExecutionTime = algo.executionTime;
			System.out.println("Total Execution Time of " + num8.length + " numbers in shell Sort take: " + shellSortExecutionTime + " milli sec");
			algo.printSortedArray(num8);

		
			


		}


	}


	

