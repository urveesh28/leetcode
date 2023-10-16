class Solution {
    
    public static void rotate(int[][] grid){
        int n=grid.length;
        int val=grid[0][0];
        for(int i=n-1;i>=0;i--){
            for(int j=grid[i].length-1;j>=0;j--){
                if(i==n-1 && j==grid[i].length-1){
                    grid[0][0]=grid[i][j];
                }
                else if(j==grid[i].length-1 && i!=n-1){
                    grid[i+1][0]=grid[i][j];
                }
                else{
                    grid[i][j+1]=grid[i][j];
                }
            }
        }
        grid[0][1]=val;
        /*for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(grid[i]));
        }*/
    }
    
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        k=k%(grid.length*grid[0].length);
        
        List<List<Integer>> mat=new ArrayList<>();
        
        if(grid[0].length==1){
            
            
            for(int l=0;l<k;l++){
                int val=grid[0][0];
                for(int i=grid.length-1;i>=0;i--){
                    for(int j=grid[i].length-1;j>=0;j--){
                        if(i==grid.length-1 && j==grid[i].length-1){
                            grid[0][0]=grid[i][j];
                        }

                        else{
                            grid[i+1][j]=grid[i][j];
                        }
                    }
                }
                grid[1][0]=val;
            }
            
            for(int i=0;i<grid.length;i++){
                List<Integer> list =new ArrayList<>();
                for(int j=0;j<grid[i].length;j++){
                    list.add(grid[i][j]);
                }
                mat.add(list);
            }
        }

        
        else{
            for(int i=0;i<k;i++){
            rotate(grid);
        }

        for(int i=0;i<grid.length;i++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                list.add(grid[i][j]);
            }
            mat.add(list);
        }
        }
        
        return mat;
    }
   
}