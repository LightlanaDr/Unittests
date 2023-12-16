package sem3.homework;


//Задание 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет,
// является ли переданное число четным или нечетным:

public class Task1and2 {
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*метод который проверяет, попадает ли переданное число
        в интервал (25;100) возвращает true, если попадает и false - если нет
         */
    public boolean numberInInterval(int n) {
        if (n >= 25 && n <= 100) return true;
        else return false;
    }

}
