class Solution {
    
    static boolean isTrue(int []arr,int k,int maxPages){
        int pages=0;
        int Student=1;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]+pages<= maxPages){
                pages=pages+arr[i];
            }
            else{
                Student++;
            
            
            if(Student>k ||arr[i]>maxPages){
                return false;
            }
            else{
                pages=0;
                pages=pages+arr[i];
            }
            }
            
        }
        return true;
    }
    
    public int findPages(int[] arr, int k) {
        int n=arr.length;
        if(k>n){
            return -1;
        }
        
        
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int s=1;
        int e=sum;
        
        int ans=0;
        
        while(s<=e){
            int mid=s+(e-s)/2;
            
            if( isTrue(arr,k,mid) ){
                ans=mid;
                e=mid-1;
                
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}