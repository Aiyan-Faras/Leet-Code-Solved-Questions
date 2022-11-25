class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rowMax = image.length;
        int colMax = image[0].length;
        int change = image[sr][sc];
        if(change == color){
            return image;
        }
        recursive(image, sr, sc, rowMax, colMax, color, change);
        
        return image;
    }
    
    void recursive(int[][] image, int i, int j, int rowMax, int colMax, int color, int change){
        if(i<0 || i>=rowMax || j<0 || j>= colMax || image[i][j]!=change){
            return;
        }   
        if(image[i][j] == change){
            image[i][j] = color;
            recursive(image, i-1, j, rowMax, colMax, color,change);
            recursive(image, i, j-1, rowMax, colMax, color, change);
            recursive(image, i, j+1, rowMax, colMax, color, change);
            recursive(image, i+1, j, rowMax, colMax, color, change);
        }
       
    }
}