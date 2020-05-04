package java.task08.task0827;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date)  {


////        Решил задачу через Calendar.
////        1) Задал формат через SimpleDateFormat.
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
//
////
////        2) Создал Calendar, предварительно преобразовав date из String в формат для Calendar
//
//        Calendar calendarDate1 = Calendar.getInstance();
//        calendarDate1.setTime(dateFormat.parse(date));
//
//
//       // 3) В if прописал следующее
//
//        if (calendarDate1.get(Calendar.DAY_OF_YEAR)%2 == 0){
//            return false;
//        }
//        return true;

        Date dt2 = new Date(date);
        Date dt1 = new Date(date);
        dt1.setMonth(0);
        dt1.setDate(1);


        long a = (dt2.getTime()-dt1.getTime())/(3600*24*1000)+1;
        if (a % 2 != 0)
            return true;

        return false;

    }
}
