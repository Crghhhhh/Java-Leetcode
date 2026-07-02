class Solution {
    public int[] twoSum(int[] nums, int target) {
        //     for(int i=0;i<nums.length;i++){
        //         for(int j=i+1;j<nums.length;j++){
        //             if(nums[i]+nums[j]==target){
        //                 return new int[]{i,j};
        //             }

        //         }
        //     }
        
        // return null;
        HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int required=target-nums[i];
            if(hm.containsKey(required)){
                return new int[]{hm.get(required),i};
            }
            hm.put(nums[i],i);
        }
        return null;
    }
}

