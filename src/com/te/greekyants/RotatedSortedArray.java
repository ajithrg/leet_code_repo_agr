package com.te.greekyants;

public class RotatedSortedArray {
	public static int missingNumber(int[] a) {
        int n = a.length;

        int pivot = findPivot(a);

        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int realMid = (mid + pivot) % n;

            if (a[realMid] == mid + 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + 1;
    }

    private static int findPivot(int[] a) {
        int low = 0, high = a.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (a[mid] > a[high]) low = mid + 1;
            else high = mid;
        }
        return low;
    }

	public static void main(String[] args) {
		int[] a = {6,7,8,1,2,4,5};
		System.out.println(missingNumber(a));
	}
}
