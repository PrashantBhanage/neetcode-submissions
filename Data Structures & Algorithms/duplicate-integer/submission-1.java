class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dekhahai = new HashSet<>();

        for(int num: nums){
            if(dekhahai.contains(num)){
                return true;
            }
            dekhahai.add(num);
        }
        return false;
    }
}