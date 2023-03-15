import java.util.Scanner;

/**
 * 井字棋 tic tac toe游戏
 */
public class ArrayThree_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SIZE = 3;
        int[][] board = new int[SIZE][SIZE];
        boolean gotResult = false;
        int numOfX = 0;
        int numOfO = 0;

        //读入矩阵
        for ( int i=0; i<board.length; i++ )
        {
            for ( int j=0; j<board[i].length; j++)
            {
                board[i][j] = in.nextInt();
            }
        }

        //检查行
        ROW:
        for ( int i=0; i<SIZE; i++ )
        {
            numOfX = 0;
            numOfO = 0;
            for ( int j=0; j<SIZE; j++ )
            {
                if ( board[i][j] == 1 )
                {
                    numOfX++;
                }
                else
                {
                    numOfO++;
                }
            }
            if ( numOfX==SIZE || numOfO==SIZE)
            {
                gotResult = true;
                break ROW;
            }
        }
        //检查列
        if ( !gotResult )
        {
            COLUMN:
            for ( int i = 0; i < SIZE; i++ )
            {
                numOfX = 0;
                numOfO = 0;
                for ( int j = 0; j<SIZE; j++ )
                {
                    if ( board[j][i] == 1 )
                    {
                        numOfX++;
                    }
                    else
                    {
                        numOfO++;
                    }
                }
                if ( numOfX == SIZE || numOfO == SIZE )
                {
                    gotResult = true;
                    break COLUMN;
                }
            }
        }
        //检查对角线
        if ( !gotResult )
        {
            numOfX = 0;
            numOfO = 0;
            for ( int i = 0; i<SIZE; i++ )
            {
                if ( board[i][i] == 1 )
                {
                    numOfX++;
                }
                else
                {
                    numOfO++;
                }
                if ( numOfX == SIZE || numOfO == SIZE )
                {
                    gotResult = true;
                }
            }
        }
        //检查反对角线
        if ( !gotResult )
        {
            numOfX = 0;
            numOfO = 0;
            for ( int i = 0; i<SIZE; i++ )
            {
                if ( board[i][SIZE-i-1] == 1 )
                {
                    numOfX++;
                }
                else
                {
                    numOfO++;
                }
            }
            if ( numOfX == SIZE || numOfO == SIZE )
            {
                gotResult = true;
            }
        }
        if ( gotResult )
        {
            if ( numOfX == SIZE )
            {
                System.out.println("X胜出");
            }
            else
            {
                System.out.println("O胜出");
            }
        }
    }
}
