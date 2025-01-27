package LAB1;

public class peak {
    
    // Method to find a peak element in the array
    public static int findPeakElement(int[] x) {
        int left = 0;
        int right = x.length - 1;

        // Binary search to find a peak element
        while (left <= right) {
            int mid = left + (right - left) / 2;  // Find the middle index

            // Check if mid is a peak element
            if ((mid == 0 || x[mid] > x[mid - 1]) && (mid == x.length - 1 || x[mid] > x[mid + 1])) {
                return x[mid]; // Return the peak element
            }

            // If the element on the left is greater, move to the left half
            if (mid > 0 && x[mid - 1] > x[mid]) {
                right = mid - 1;
            } 
            // If the element on the right is greater, move to the right half
            else {
                left = mid + 1;
            }
        }

        return -1;  // This line should never be reached if the input array follows the problem's constraints
    }

    public static void main(String[] args) {
        // Example array where a peak element exists
        int[] arr = {1, 3, 20, 4, 1, 0};

        // Call the findPeakElement method
        int peak = findPeakElement(arr);

        // Print the peak element
        System.out.println("Peak element: " + peak);
    }
}
