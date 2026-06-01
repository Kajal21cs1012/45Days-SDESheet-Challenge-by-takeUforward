class Solution {

    public int pascalTriangleI(int r, int c) {

        int n = r - 1;
        int k = c - 1;
        long value = 1;

        for (int i = 1; i <= k; i++) {
            value = value * (n - i + 1) / i;
        }

        return (int) value;
    }
}
