public class FindPeakElement {
	public static void main(String[] args) {
		int[] arr = {1, 3, 20, 4, 1, 0};
		System.out.println(helper(arr));
	}
	public static int helper(int[] arr) {
		int left = 0, right = arr.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] > arr[mid + 1]) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}
}
