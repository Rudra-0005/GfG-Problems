class Solution {
    static boolean isValid(int newX,int newY,int n,int maze[][],boolean visited[][]){
        if(newX<0 ||newX>=n || newY<0 ||newY>=n){
            return false;
        
        }
        else if(visited[newX][newY]==true){
            return false;
        }
        else if(maze[newX][newY]==0){
            return false;
        }
        else{
            return true;
        }
    }
    static void solve(int maze[][],int srcx,int srcy,int destx,int desty,ArrayList<String>ans,boolean visited[][],String path){
       //base case
       if(srcx==destx && srcy==desty){
          ans.add(path);
          return;
       }
        
        int n=maze.length;
        visited [srcx][srcy]=true;
        
        //upward movement
        int newX=srcx-1;
        int newY=srcy;
            
        if(isValid(newX,newY,n,maze,visited)){
            solve(maze,newX,newY,destx,desty,ans,visited,path+"U");
        }
        
        // downward
        newX=srcx+1;
        newY=srcy;
        if(isValid (newX,newY,n,maze,visited)){
            solve(maze,newX,newY,destx,desty,ans,visited,path+"D");
        }
        
        // left
        newX=srcx;
        newY=srcy-1;
        if(isValid (newX,newY,n,maze,visited)){
            solve(maze,newX,newY,destx,desty,ans,visited,path+"L");
        }
        
        //right
        newX=srcx;
        newY=srcy+1;
        if(isValid (newX,newY,n,maze,visited)){
            solve(maze,newX,newY,destx,desty,ans,visited,path+"R");
        }
        
        visited[srcx][srcy]=false;
    }
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        int srcx=0;
        int srcy=0;
        
        int n= maze.length;
        
        int destx=n-1;
        int desty=n-1;
        
        boolean visited[][] =new boolean [n][n];
        ArrayList<String>ans=new ArrayList<>();
        String path = "";
        
        // src ya dest blocked hai toh 
        if((maze[0][0]==0 )||(maze[n-1][n-1]==0)){
            return ans;
        }
        solve(maze,srcx,srcy,destx,desty,ans,visited,path);
        Collections.sort(ans);
        return ans;
        
    }
}