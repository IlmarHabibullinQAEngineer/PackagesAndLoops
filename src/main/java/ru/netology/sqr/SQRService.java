package ru.netology.sqr;

public class SQRService {

    //Количество квадратных чисел.
    public int sqare(int start, int end) {
        int check = 0;

        for (int i = 10; i <= 99; i++) {
            int sqar = i * i;
            if (sqar >= start) {
                if (sqar <= end) {
                    check++;
                }
            }
        }
        return check;
    }
}