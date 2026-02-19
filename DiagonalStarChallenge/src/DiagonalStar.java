public class DiagonalStar {
    // write code here
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        int rows = 1;
        int columns = 1;

        for (rows = 1; rows <= number; rows++) {

            for (columns = 1; columns <= number; columns++) {

                if (rows == 1 || rows == number || columns == 1 || columns == number || rows == columns || columns == number - rows + 1) {

                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}