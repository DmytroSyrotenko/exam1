import java.util.Scanner;

public class Task2 {
    /*
    Ход коня по шахматной доске.Вводится тeкущее положение коня и клетка в которую пробуют его передвинуть за 1 ход.
    Программа должна проверить можно ли єто сделать.
     */
    public static void main(String[] args) {

        int[][] array = chessDeskFill();

        System.out.print("Enter current position(int values only):");
        int curr = new Scanner(System.in).nextInt();

        System.out.print("Enter required position(int values only):");
        int dest = new Scanner(System.in).nextInt();

        System.out.println(realOrNot(array, curr, dest));
    }

    public static int[][] chessDeskFill() {

        int[][] array = new int[8][8];

        int index = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = index;
                index++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 10) {
                    System.out.print(" " + array[i][j] + "|");
                } else {
                    System.out.print(array[i][j] + "|");
                }
            }
            System.out.println();
        }
        return array;

    }

    public static boolean realOrNot(int[][] array, int curr, int dest) {
        /////// index definition

        int currentPosition = curr;
        int destination = dest;

        int xFrom = -1;
        int yFrom = -1;
        int xTo = -1;
        int yTo = -1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == currentPosition) {
                    xFrom = i;
                    yFrom = j;
                } else if (array[i][j] == destination) {
                    xTo = i;
                    yTo = j;
                }
            }
        }

        /////// is possible move

        boolean isPossible = false;

        if (    (xTo == xFrom - 2 || xTo == xFrom + 2) && (yTo == yFrom - 1 || yTo == yFrom + 1)
             || (xTo == xFrom + 1 || xTo == xFrom - 1)&& (yTo == yFrom - 2 || yTo == yFrom + 2) )

        {
            isPossible = true;
        }
        return isPossible;
    }
}


