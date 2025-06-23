

public class BinarySearch {

	// Takes a sorted array and returns the index of the given integer
	public static int binarysearch(int arr[], int key) {
		int low = 0;
		int high = arr.length - 1;
		int mid;

		while (low <= high) {
			mid = (low + high) / 2;
		
			if (key == arr[mid]) {
				return mid;
			}
			if (key < arr[mid]) {
				high = mid - 1;
			}
			if (key > arr[mid]) {
				low = mid + 1;
			}
		}
		return -1; // key not found
	}

	public static void main(String[] args) {
		int arr[] = {2, 4, 5, 11, 12, 13};
		System.out.println("Number 5 found at index " + binarysearch(arr, 5));
	}

}
