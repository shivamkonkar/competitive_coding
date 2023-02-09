

//User function Template for Java

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {   
        Set<Integer> hash_Set = new HashSet<Integer>();
        for(int i = 0; i < n ; i++){
            hash_Set.add(a[i]);
        }
        for(int i = 0; i < m ; i++){
            hash_Set.add(b[i]);
        }
        
        return hash_Set.size();
    }
}