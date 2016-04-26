package P6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int cases;
        int rows;
        int columns;
        int row;
        int column;
        int nextRow;
        int nextColumn;
        boolean exit;
        boolean next;
        String line;
        Character orientation;
        boolean[][] maze;
        cases = Integer.parseInt(lector.nextLine());
        for (int i = 0; i < cases; i++) {
            lector.nextLine();
            rows = lector.nextInt();
            columns = lector.nextInt();
            maze = new boolean[rows][columns];
            lector.nextLine();
            for (int j = 0; j < rows; j++) {
                line = lector.nextLine();
                for (int k = 0; k < columns; k++) {
                    maze[j][k] = (Character.compare(' ', line.charAt(k)) == 0);
                }
            }
            row = lector.nextInt();
            column = lector.nextInt();
            nextRow = row;
            nextColumn = column;
            orientation = 'N';
            lector.nextLine();
            exit = false;
            while (!exit) {
                line = lector.nextLine();
                for (int j = 0; (j < line.length() && !exit); j++) {
                    switch (line.charAt(j)) {
                        case 'R':
                            orientation = rotateRobot(true, orientation);
                            break;
                        case 'L':
                            orientation = rotateRobot(false, orientation);
                            break;
                        case 'F':
                            switch (orientation) {
                                case 'N':
                                    nextRow = row - 1;
                                    nextColumn = column;
                                    break;
                                case 'W':
                                    nextRow = row;
                                    nextColumn = column - 1;
                                    break;
                                case 'S':
                                    nextRow = row + 1;
                                    nextColumn = column;
                                    break;
                                case 'E':
                                    nextRow = row;
                                    nextColumn = column + 1;
                                    break;
                            }
                            if (maze[nextRow - 1][nextColumn - 1]) {
                                row = nextRow;
                                column = nextColumn;
                            }
                            break;
                        case 'Q':
                            exit = true;
                            break;
                    }
                }
            }
            System.out.println(row + " " + column + " " + orientation);
            if (i < cases - 1) {
                System.out.println("");
            }
        }
    }

    private static Character rotateRobot(boolean right, Character orientation) {
        Character newOrientation = null;
        if (right) {
            switch (orientation) {
                case 'N':
                    newOrientation = 'E';
                    break;
                case 'W':
                    newOrientation = 'N';
                    break;
                case 'S':
                    newOrientation = 'W';
                    break;
                case 'E':
                    newOrientation = 'S';
                    break;
            }
        } else {
            switch (orientation) {
                case 'N':
                    newOrientation = 'W';
                    break;
                case 'W':
                    newOrientation = 'S';
                    break;
                case 'S':
                    newOrientation = 'E';
                    break;
                case 'E':
                    newOrientation = 'N';
                    break;
            }
        }
        return newOrientation;
    }

}
