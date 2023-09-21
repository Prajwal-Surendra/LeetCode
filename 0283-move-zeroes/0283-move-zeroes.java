class Solution {
    public void moveZeroes(int[] a) {
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1) 
            return;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < a.length; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
    } 
}