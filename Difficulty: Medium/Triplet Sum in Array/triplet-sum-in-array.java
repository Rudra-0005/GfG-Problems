class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        Arrays.sort(arr);
        int n=arr.length;
        
        
        for(int i=0;i<n-2;i++){
             int ans =target-arr[i];
             
             int start = i+1;
             
             int end = arr.length-1;
             
             while(start<end){
                 
                 if(arr[start]+arr[end]==ans){
                 return true;
                 }
                 
                 else if(arr[start]+arr[end]<ans){
                     start++;
                 }
                 
                 else{
                     end--;
                 }
             }
            
             
        
        }
        return false;
       
    }
}
