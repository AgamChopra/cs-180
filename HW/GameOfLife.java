import java.util.Scanner;
/*
Written by: Agam Chopra
*/
public class GameOfLife{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows/columns: ");
        int size = scan.nextInt();
        scan.nextLine();
        System.out.println();
        int[][] grid;
        grid = new int[size][size];
        String input;
        for(int i = 0; i<size;i++) {
            input = scan.nextLine();
            for(int j = 0; j<size;j++) {
                if('1' == input.charAt(j*2))
                    grid[i][j] = 1;
                else
                    grid[i][j] = 0;
            }
        }

        display_grid(grid, size, 0);
        System.out.println();
        String flag = scan.nextLine();
        if((flag.charAt(0) != 'q')&&(flag.charAt(0) != 'Q'))
            nextGeneration(grid, size, scan, 1);
        else
            System.out.println("Program Terminated");
    }

    static void nextGeneration(int grid[][], int size, Scanner scan, int gen)
    {
        int[][] future = new int[size][size];
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                int live = live_nbr(grid, size, i, j);
                if(grid[i][j] == 1){
                    if(live<2||live>3)
                        future[i][j] = 0;
                    else
                        future[i][j] = 1;
                }
                else{
                    if(live == 3)
                        future[i][j] = 1;
                    else
                        future[i][j] = 0;
                }
                //System.out.print(live+" ");
            }//System.out.println();
        }

        display_grid(future, size, gen);
        System.out.println();
        String flag = scan.nextLine();
        if((flag.charAt(0) != 'q')&&(flag.charAt(0) != 'Q'))
            nextGeneration(future, size, scan, gen + 1);
        else
            System.out.println("Program Terminated");
    }

    static void display_grid(int grid[][], int size, int gen){
        System.out.println();
        System.out.println("Generation "+gen+":");
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if( j != size-1)
                    System.out.print(grid[i][j]+" ");
                else
                    System.out.println(grid[i][j]);
            }
        }
    }

    static int live_nbr(int grid[][], int size,int i, int j){
        int live = 0;
        //boundary
        if(i == 0 && j == 0){
            //x+
            //++
            if(grid[0][1]==1)
                live++;
            if(grid[1][1]==1)
                live++;
            if(grid[1][0]==1)
                live++;
        }
        else if(i == 0 && j == size - 1){
            //x+
            //++
            if(grid[0][size-2]==1)
                live++;
            if(grid[1][size-1]==1)
                live++;
            if(grid[1][size-2]==1)
                live++;
        }
        else if(i == size-1 && j == 0){
            //x+
            //++
            if(grid[size-1][1]==1)
                live++;
            if(grid[size-2][1]==1)
                live++;
            if(grid[size-2][0]==1)
                live++;
        }
        else if(i == size-1 && j == size-1){
            //++
            //+x
            if(grid[size-2][size-2]==1)
                live++;
            if(grid[size-2][size-1]==1)
                live++;
            if(grid[size-1][size-2]==1)
                live++;
        }
        else if(i == 0){
            //+x+
            //+++
            if(grid[0][j - 1]==1)
                live++;
            if(grid[0][j + 1]==1)
                live++;
            for(int k = -1; k<2; k++){
                if(grid[1][j+k] == 1)
                    live++;
            }
        }
        else if(i == size-1){
            //+x+
            //+++
            if(grid[size-1][j - 1]==1)
                live++;
            if(grid[size-1][j + 1]==1)
                live++;
            for(int k = -1; k<2; k++){
                if(grid[size-2][j+k] == 1)
                    live++;
            }
        }
        else if(j == 0){
            //++
            //x+
            //++
            if(grid[i-1][0]==1)
                live++;
            if(grid[i+1][0]==1)
                live++;
            for(int k = -1; k<2; k++){
                if(grid[i+k][1] == 1)
                    live++;
            }
        }
        else if(j == size-1){
            //+x+
            //+++
            if(grid[i-1][size-1]==1)
                live++;
            if(grid[i+1][size-1]==1)
                live++;
            for(int k = -1; k<2; k++){
                if(grid[i+k][size-2] == 1)
                    live++;
            }
        }//inner
        else{
            for(int k = -1; k<2;k++){
                for(int l = -1; l<2; l++){
                    if(grid[i+k][j+l]==1)
                        live++;
                }
            }
            if(grid[i][j]==1)
                live--;
        }
        return live;
    }
}
