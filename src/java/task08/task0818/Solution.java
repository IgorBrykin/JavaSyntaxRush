package java.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу:
 "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
4. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Овчинников", 500);
        map.put("Солженицин", 300);
        map.put("Веселов", 1000);
        map.put("Иванов", 2000);
        map.put("Сидоров", 300);
        map.put("Пупкин", 200);
        map.put("Кривоногов", 300);
        map.put("Криворуков", 200);
        map.put("Семиуголин", 600);
        map.put("Кукушвилли", 500);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> map1 = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> stringIntegerEntry : map1.entrySet()) {
            if (stringIntegerEntry.getValue() < 500) {
                map.remove(stringIntegerEntry.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}