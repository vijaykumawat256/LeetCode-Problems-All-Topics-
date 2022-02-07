class Solution {
    public char[][] rotateTheBox(char[][] box) {
        // Applying gravity with 2 pointers
        // S "looks" for stones while fallPos is the next available empty space
        for(char[] row: box) {
            int fallPos = row.length - 1;
            for(int s = row.length - 1; s >= 0; s--) {
                if(row[s] == '#') {
                    row[s] = '.';
                    row[fallPos--] = '#';
                }
                else if(row[s] == '*') {
                    fallPos = s - 1;   
                }
            }
        }
        
        // Create 90 degree rotated version of array
        char[][] rotated = new char[box[0].length][box.length];
        for(int r = 0; r < box.length; r++) {
            for(int c = 0; c < box[0].length; c++) {
                rotated[c][box.length-1-r] = box[r][c];
            }
        }
        return rotated;
    }
}