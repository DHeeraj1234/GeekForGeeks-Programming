class SearchElement{
    static int searchInSorted(int arr[], int n, int x)
    {
        
        // Your code here
        for(int i=0;i<n;++i){
            if(arr[i]==x){
                return 1;
            }
        }
        return -1;
    }
}