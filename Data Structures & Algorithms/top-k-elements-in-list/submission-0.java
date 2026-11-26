class Pair{
    int a;
    int b;
    Pair(int a,int b){
        this.a = a;
        this.b = b;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1,p2) -> p2.b - p1.b);
        for(HashMap.Entry<Integer,Integer> m : map.entrySet()){
            pq.offer(new Pair(m.getKey(),m.getValue()));
        }
        int ar[] = new int[k];
        for(int t=0;t<k;t++){
            ar[t] = pq.poll().a;
        }
        return ar;
        
    }
}
