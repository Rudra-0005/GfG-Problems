class Solution {
    public static char getMaxOccuringChar(String s) {
        int arr[]=new int[26];
        
        for(int i =0;i<s.length();i++){
            char currChar=s.charAt(i);
            arr[currChar-'a']++;
        }
        
        int maxi=0;
        char ans='a';
        
        
        for(int i=0;i<26;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
                ans=(char)(i+'a');
            }
            
        }
        return ans;
        
    }
}