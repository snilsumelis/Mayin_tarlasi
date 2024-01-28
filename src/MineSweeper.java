import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    String[][] map = new String[this.rowNumber][this.colNumber];
    String[][] emptyMap = new String[this.rowNumber][this.colNumber];

    MineSweeper(int rowNumber, int colNumber) {
        this.colNumber = colNumber;
        this.rowNumber = rowNumber;
        this.map = new String[rowNumber][colNumber];
        this.emptyMap = new String[rowNumber][colNumber];
    }

    public void run() {
        int mayinNum = (int) ((this.rowNumber * this.colNumber) / 4);

        Random random = new Random();
        while (mayinNum > 0) {
            int randomRow = random.nextInt(this.rowNumber);
            int randomCol = random.nextInt(this.colNumber);

            if (map[randomRow][randomCol] == null) {
                map[randomRow][randomCol] = " * ";
                mayinNum--;
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == null) {
                    map[i][j] = " - ";
                }
            }
        }

        System.out.println("Mayınların Konumu : ");
        printMap(map);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        for (int i = 0; i < emptyMap.length; i++) {
            for (int j = 0; j < emptyMap[i].length; j++) {
                emptyMap[i][j] = " - ";
            }
        }
        printMap(emptyMap);

        Scanner input = new Scanner(System.in);
        boolean isFinish = true;

        while (isFinish) {
            int count = 0;
            System.out.print("Satır Giriniz : ");
            int user_row = input.nextInt();
            System.out.print("Sütun Giriniz : ");
            int user_col = input.nextInt();

            if (user_row >= this.rowNumber || user_row <0 || user_col >= this.colNumber || user_col <0 ){
                System.out.println("hatalı bir değer girdiniz");
                continue;
            }
            if (map[user_row][user_col].equals(" * ")) {
                System.out.println("Game Over!! ===========================");
                isFinish = false;
                break;
            } else {
                if (user_row > 0 && user_col > 0 && (map[user_row - 1][user_col - 1].equals(" * "))) {
                    //sol üst çapraz
                    count++;
                } else if (user_col > 0 && (map[user_row][user_col - 1].equals(" * "))) {
                    //sol
                    count++;
                } else if (user_col > 0 && user_row < (map.length - 1) && (map[user_row + 1][user_col - 1].equals(" * "))) {
                    //sol alt çapraz
                    count++;
                } else if (user_row > 0 && map[user_row - 1][user_col].equals(" * ")) {
                    //üst
                    count++;
                } else if (user_row > 0 && user_col < (map[0].length - 1) && (map[user_row - 1][user_col + 1].equals(" * "))) {
                    //sağ üst çapraz
                    count++;
                } else if (user_col < (map[0].length - 1) && (map[user_row][user_col + 1].equals(" * "))) {
                    //sağ
                    count++;
                } else if (user_col < (map[0].length - 1) && user_row < (map.length - 1) && (map[user_row + 1][user_col + 1].equals(" * "))) {
                    //sağ alt çapraz
                    count++;
                } else if (user_row < (map.length - 1) && (map[user_row + 1][user_col].equals(" * "))) {
                    //alt
                    count++;
                }
                emptyMap[user_row][user_col] = String.valueOf(" " +count +" ");
                printMap(emptyMap);
            }
        }
    }

    static void printMap(String[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }


    boolean isOkey(int row, int col) {
        if (col < 2 || row < 2) {
            System.out.println("Hatalı giriş yaptınız lütfen tekrar sayı giriniz");
            return false;
        } else return true;
    }

}
