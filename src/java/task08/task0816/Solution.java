package java.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и
занести в него десять записей по принципу:
"фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь
HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря
 всех людей, родившихся летом.
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталл", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталлон", dateFormat.parse("MAY 1 2012"));
        map.put("Сталло", dateFormat.parse("JUNE 1 2012"));
        map.put("Стал", dateFormat.parse("MAY 3 2012"));
        map.put("Ста", dateFormat.parse("MAY 1 2012"));
        map.put("Ст", dateFormat.parse("MAY 1 2012"));
        map.put("С", dateFormat.parse("MAY 1 2012"));
        map.put("Джесса", dateFormat.parse("MAY 1 2012"));
        map.put("Се", dateFormat.parse("JULY 18 1980"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> entry = iterator.next();
            if (entry.getValue().getMonth() > 4 && entry.getValue().getMonth()<8){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}
