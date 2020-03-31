class Solution
{
    public static void kLargest(int arr[], int n, int k)
    {
        // Write your code here
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<n;++i){
            pq.add(arr[i]);
        }
        for(int j=0;j<k;++j){
            System.out.print(pq.poll()+" ");
        }
        System.out.println();
        
    }
}