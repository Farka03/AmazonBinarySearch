package com.binaryfind.task;

public class Find {

    public boolean searchMatrix(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int l = 0, r = n - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (matrix[i][mid] == k) {
                    return true;
                }
                if (matrix[i][mid] > k) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return false;
    }
}
