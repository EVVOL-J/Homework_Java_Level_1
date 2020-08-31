package Lesson4;

import java.util.Scanner;

public class TicTacToe {
    private static Scanner scan = new Scanner(System.in);
    private static final char signX = 'x';//10008
    private static final char signO = 'o';//9675
    private static final char signPoint = 8226;
    private static Scanner scanner = new Scanner(System.in);
    private static int sizeField = 0;
    private static int winNumber = 0;
    private static int coordinataX = 0;
    private static int coordinataY = 0;
    private static char[][] arrayField;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите размеры поля больше 2 и меньше 11");
            sizeField = checkNumber(3, 10);
            System.out.println("Введите размеры выигрышной комбинации больше 2 и меньше " + (sizeField + 1));
            winNumber = checkNumber(3, sizeField);
            arrayField = new char[sizeField][sizeField];
            clearArrrayField(arrayField);
            while (true) {
                playerMove(arrayField);
                if (checkWin(arrayField, winNumber, signX)) {
                    System.out.println("YOU WIN");
                    break;
                }
                if(fullArr(arrayField)){
                    System.out.println("DRAW");
                    break;
                }
                computerMove(arrayField);
                if (checkWin(arrayField, winNumber, signO)) {
                    System.out.println("YOU LOOSE");
                    break;
                }
                if(fullArr(arrayField)){
                    System.out.println("DRAW");
                    break;
                }

            }
            System.out.println("play yet? Yes=1 NO=enter any symbol");
            scanner.nextLine();
            if ( !scanner.nextLine().equals("1")) break;


        }
        scanner.close();
    }

    private static void printGameField(char[][] arrayFild) {
        System.out.println("  Y");
        System.out.print("X  ");
        for (int i = 1; i <= arrayFild.length; i++) System.out.print(i + " ");
        System.out.println();
        for (int i = 1; i <= arrayFild.length; i++) {
            if (i < 10) System.out.print(" " + i + " ");
            else System.out.print(i + " ");
            for (int j = 0; j < arrayFild.length; j++) {
                System.out.print(arrayFild[i - 1][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    } //функция вывода поля

    private static void clearArrrayField(char[][] arrayFild) {
        for (int i = 0; i < arrayFild.length; i++) {
            for (int j = 0; j < arrayFild.length; j++) arrayFild[i][j] = signPoint;
        }
        printGameField(arrayFild);
    }//функция отчистки поля

    private static int checkNumber(int minNum, int maxNum) {
        int checkNum = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                checkNum = scanner.nextInt();
                if (maxNum >= checkNum && checkNum >= minNum) break;
                else System.out.println("Введите число больше " + (minNum - 1) + " и иеньше " + (maxNum + 1));
            } else System.out.println("Введите целое число");
            scanner.nextLine();
        }
        return checkNum;
    }//функция проверки ввода коректных данных

    private static void playerMove(char[][] arrayField) {
        while (true) {
            System.out.println("Введите координату X от 1 до " + sizeField);
            coordinataX = checkNumber(1, sizeField);
            System.out.println("Введите координату Y от 1 до " + sizeField);
            coordinataY = checkNumber(1, sizeField);
            if (arrayField[coordinataY - 1][coordinataX - 1] == signPoint) {
                arrayField[coordinataY - 1][coordinataX - 1] = signX;
                break;
            } else System.out.println("Клетка занята,выберите другую клетку");
        }
        printGameField(arrayField);

    }//функция хода пользователя

    private static boolean checkWin(char[][] arrayField, int winNumber, char checkSymbol) {
        int number_Array = arrayField.length - winNumber;
        boolean win = false;
        for (int i = 0; i <= number_Array; i++) {//разбиваем массив на простые подмассивы где уже проверям всю строку, столбец или диагональ
            if (win == true) break;
            for (int j = 0; j <= number_Array; j++) {
                if (win == true) break;
                int cntDiagMain = 0;
                int cntDiag = 0;

                for (int k = i; k < winNumber + i; k++) {
                    if (win == true) break;
                    int cntGoriz = 0;
                    int cntVertic = 0;


                    for (int g = j; g < winNumber + j; g++) {
                        if (win == true) break;
                        if (arrayField[k][g] == checkSymbol) cntGoriz++; //проверка по горизонтали
                        else cntGoriz = 0;
                        if (arrayField[g][k] == checkSymbol) cntVertic++;//проверка по вертикали
                        else cntVertic = 0;
                        if ((k - i) == (g - j)) {
                            if (arrayField[k][g] == checkSymbol) cntDiagMain++;//проверка по главной диагонали
                            else cntDiagMain = 0;
                        }
                        if ((k - i) == winNumber - 1 - (g - j)) {
                            if (arrayField[k][g] == checkSymbol) cntDiag++;//проверка по второстепенной диагонали
                            else cntDiag = 0;
                        }

                        if (cntVertic == winNumber || cntGoriz == winNumber || cntDiagMain == winNumber || cntDiag == winNumber)
                            win = true;

                    }

                }

            }
        }
        return win;
    }//функция проверки на выигрыш

    private static void computerMove(char[][] arrayField) {
        boolean hod = false;
        int i = 1;
        while (hod == false) {
            hod = blockHod(arrayField, i);
            i++;
        }

        printGameField(arrayField);
    }//функция хода компьютера

    private static boolean blockHod(char[][] arrayField, int prioritet) {
        int cntXgoriz = 0, cntPointGoriz = 0, cntXvertic = 0, cntPointVertic = 0;
        int cntXMainDiag = 0, cntPointMainDiag = 0, cntXDiag = 0, cntPointDiag = 0;
        char[] blockArr = new char[winNumber];
        int number_Array = arrayField.length - winNumber;
        boolean hod = false;
        //цикл блокировки хода
        for (int i = 0; i <= number_Array; i++) {
            if (hod == true) break;
            for (int j = 0; j <= number_Array; j++) {
                if (hod == true) break;
                cntXMainDiag = 0;
                cntPointMainDiag = 0;
                cntXDiag = 0;
                cntPointDiag = 0;
                for (int k = i; k < winNumber + i; k++) {
                    if (hod == true) break;
                    cntXgoriz = 0;
                    cntPointGoriz = 0;
                    cntXvertic = 0;
                    cntPointVertic = 0;

                    for (int g = j; g < winNumber + j; g++) {
                        if (hod == true) break;

                        if (arrayField[k][g] == signX) cntXgoriz++;//блокировка по горизонтали
                        if (arrayField[k][g] == signPoint) cntPointGoriz++;
                        if ((cntXgoriz == (winNumber - prioritet) && cntPointGoriz == prioritet)) {
                            for (int b = 0; b < winNumber; b++) {
                                blockArr[b] = arrayField[k][g - (winNumber - 1) + b];
                            }

                            arrayField[k][g - (winNumber - 1) + computerAnaliz(blockArr)] = signO;
                            hod = true;
                        }

                        if (hod == true) break;
                        if (arrayField[g][k] == signX) cntXvertic++;//блокировка по вертикали
                        if (arrayField[g][k] == signPoint) cntPointVertic++;
                        if ((cntXvertic == (winNumber - prioritet) && cntPointVertic == prioritet)) {
                            for (int b = 0; b < winNumber; b++) {
                                blockArr[b] = arrayField[g - (winNumber - 1) + b][k];
                            }
                            arrayField[g - (winNumber - 1) + computerAnaliz(blockArr)][k] = signO;
                            hod = true;
                        }

                        if (hod == true) break; //блокировка по главной диагонали
                        if ((k - i) == (g - j)) {
                            if (arrayField[k][g] == signX) cntXMainDiag++;
                            if (arrayField[k][g] == signPoint) cntPointMainDiag++;
                            if ((cntXMainDiag == (winNumber - prioritet) && cntPointMainDiag == prioritet)) {
                                for (int b = 0; b < winNumber; b++) {
                                    blockArr[b] = arrayField[k - (winNumber - 1) + b][g - (winNumber - 1) + b];
                                }
                                int offset = computerAnaliz(blockArr) - (winNumber - 1);
                                arrayField[k + offset][g + offset] = signO;
                                hod = true;
                            }
                        }


                        if (hod == true) break; //блокировка по побочной диагонали
                        if ((k - i) == winNumber - 1 - (g - j)) {
                            if (arrayField[k][g] == signX) cntXDiag++;
                            if (arrayField[k][g] == signPoint) cntPointDiag++;
                            if ((cntXDiag == (winNumber - prioritet) && cntPointDiag == prioritet)) {
                                for (int b = 0; b < winNumber; b++) {
                                    blockArr[b] = arrayField[k - (winNumber - 1) + b][g + (winNumber - 1) - b];
                                }
                                int offset = computerAnaliz(blockArr);
                                arrayField[k - (winNumber - 1) + offset][g + (winNumber - 1) - offset] = signO;
                                hod = true;
                            }
                        }


                    }
                }
            }

        }
        return hod;
    }//функция блокировки

    private static int computerAnaliz(char[] blockArr) {
        int pos = 0;
        for (int i = 1; i < blockArr.length - 1; i++) {
            if (blockArr[i] == signPoint) pos = i;
        }
        if (pos == 0 && blockArr[0] == signPoint) pos = 0;
        if (pos == 0 && blockArr[blockArr.length - 1] == signPoint) pos = blockArr.length - 1;
        return pos;

    } // функция, которая определяет куда ставить круг

    private static boolean fullArr(char[][] arrayField) {
        boolean full=true;
        for (int i = 0; i < arrayField.length; i++) {
            if(full==false) break;
            for(int j=0; j<arrayField.length;j++){
                if(arrayField[i][j]==signPoint) full=false;
                if(full==false) break;
            }
        }
        return  full;
    }  //проверка на заполнение всего массива

}
