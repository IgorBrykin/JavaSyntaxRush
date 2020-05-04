package java.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять
записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем
или фамилией.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь
Map с типом элементов String, String состоящих из 10 записей
по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число
людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать
число людей у которых совпадает фамилия.
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Овчинников", "Семен");
        map.put("Солженицин", "Александр");
        map.put("Веселов", "Алексей");
        map.put("Иванов", "Илья");
        map.put("Сидоров", "Василий");
        map.put("Пупкин", "Александр");
        map.put("Кривоногов", "Вечеслав");
        map.put("Криворуков", "Владислав");
        map.put("Семиуголин", "Дмитрий");
        map.put("Кукушвилли", "Игорь");
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int countFamily = 0;
        for (String s : map.values()) {
            if (s.equals(name))
                countFamily++;

        }
        return countFamily;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countFamily1 = 0;
        for (String s : map.keySet()) {
            if (s.equals(lastName))
                countFamily1++;

        }
        return countFamily1;
    }

    public static void main(String[] args) {

    }
}
