class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(frequency.containsKey(nums[i])){
                frequency.replace(nums[i],frequency.get(nums[i])+1);
            }
            else {
                frequency.put(nums[i],1);
            }
        }

        HashMap<Integer,ArrayList<Integer>> bucket = new HashMap<>();


        for(int i : frequency.keySet()){
            int freq = frequency.get(i);

            if(bucket.get(freq) == null){
               
                bucket.put(freq,new ArrayList<>());
            }
            ArrayList<Integer> test = bucket.get(freq);
            test.add(i);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        int max = nums.length;
        int counter = 0 ;
        while(arr.size() < k){
            if(bucket.containsKey(max)){
                arr.addAll(bucket.get(max));
            }
            max--;
        }

        int result[] = new int[k];
        for(int i = 0 ; i < result.length ; i++){
            result[i] = arr.get(i);
        }



        return result;
    }
}
