class Solution {
    public int[] sortArray(int[] nums) {
     QuickSort(nums, 0, nums.length-1);
        return nums;
    }
    static void QuickSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int mid = (s+e)/2;
        int pivot = arr[mid];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        QuickSort(arr,low,e);
        QuickSort(arr,s,high);
    }
}