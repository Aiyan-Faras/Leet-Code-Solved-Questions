class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int oddpt=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==0){
                int temp = arr[i];
                arr[i] = arr[oddpt];
                arr[oddpt] = temp;
                oddpt++;
            }
        }
        return arr;
    }
}