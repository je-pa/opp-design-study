package test1;

public class CheckerBoard implements Board{
    private int x;
    private int y;
    private Object[][] board;

    CheckerBoard(int x, int y){
        board = new Object[x][y];
    }

    @Override
    public Object getXY(int x, int y) {
        return board[x][y];
    }

    @Override
    public void setXY(int x, int y, Object object) {
        this.board[x][y] = object;
    }
}
