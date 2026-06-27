class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n*n;

        Set<Integer> set = new HashSet<>(size);
        int repeated=0;
        int sumOfTheSet=0; 

        for(int [] rows: grid){
            for(int nums: rows){
                if(!set.add(nums)){
                    repeated = nums;
                }
                else{
                    sumOfTheSet+=nums;
                }
            }
        }
        int ExpectedSumOfTheSet = size*(size+1)/2;
        int missing= ExpectedSumOfTheSet-sumOfTheSet;
        return new int[]{repeated, missing};
    }
}