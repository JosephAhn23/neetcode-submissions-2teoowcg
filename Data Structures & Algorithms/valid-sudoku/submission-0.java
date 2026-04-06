class Solution {
    public static boolean isValidSudoku(char[][] board) {
    // Initialize maps for columns, rows, and squares
    Map<Integer, Set<Character>> cols = new HashMap<>();
    Map<Integer, Set<Character>> rows = new HashMap<>();
    Map<Integer, Set<Character>> squares = new HashMap<>();

    // Initialize sets for each row, column, and square
    for (int i = 0; i < 9; i++) {
        cols.put(i, new HashSet<>());
        rows.put(i, new HashSet<>());
        squares.put(i, new HashSet<>());
    }

    // Iterate through each cell in the board
    for (int r = 0; r < 9; r++) {
        for (int c = 0; c < 9; c++) {
            char cell = board[r][c];
            if (cell == '.') {
                continue;
            }
            // Check if the same number exists in the same row, column, or square
            if (rows.get(r).contains(cell) || cols.get(c).contains(cell) ||
                    squares.get((r / 3) * 3 + c / 3).contains(cell)) {
                return false;
            }
            // Add the current cell value to the respective sets
            rows.get(r).add(cell);
            cols.get(c).add(cell);
            squares.get((r / 3) * 3 + c / 3).add(cell);
        }
    }
    return true;
}

}
