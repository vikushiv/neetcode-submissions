
class Solution {
    public boolean hasDuplicate(int[] nums) {
       Map<Integer,Integer>feq= new HashMap<>();
        for(int i:nums){
            feq.put(i,feq.getOrDefault(i,0)+1);
        }
         for(int i:nums){
            if(feq.get(i)>1){
                return true;
            }
            
        }
        return false;




        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }

        // }
        
    }
    // return false;
    }
// }