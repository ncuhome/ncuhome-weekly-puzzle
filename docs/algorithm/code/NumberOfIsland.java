public class NumberOfIsland{
    public int numIslands(char[][] grid){
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    Search(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void Search(char[][] list,int i,int j){
        if(i<0||i>list.length||j<0||j>list[i].length){
            return ;
        }
        if(list[i][j]!='1'){
            return ;
        }
        list[i][j]='0';
        Search(list, i+1, j);
        Search(list, i-1, j);
        Search(list, i, j+1);
        Search(list, i, j-1);
    }
}