package java.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
1. Создать словарь Map (<String, String>)
и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди
с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди
с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.


Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать только три метода.
3. Метод createPeopleMap() должен создавать и возвращать
словарь Map с типом элементов String, String. Кроме того,
добавлять в словарь 10 человек.
4. В методе createPeopleMap() должны добавляться люди
с одинаковыми фамилиями.
5. В методе createPeopleMap() должны добавляться люди с
одинаковыми именами.
6. Метод printPeopleMap() должен выводить на экран всех
людей из словаря Map. Каждое значение вывести с новой строки. Фамилия и имя разделены пробелом.
7. Метод main() должен вызывать метод createPeopleMap().
8. Метод main() должен вызывать метод printPeopleMap().
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("Овчинников", "Семен");
        map1.put("Солженицин", "Александр");
        map1.put("Веселов", "Алексей");
        map1.put("Кругликов", "Илья");
        map1.put("Сидоров", "Василий");
        map1.put("Пупкин", "Вечеслав");
        map1.put("Кривоногов", "Вечеслав");
        map1.put("Криворуков", "Владислав");
        map1.put("Кругликов", "Дмитрий");
        map1.put("Кукушвилли", "Игорь");

        return map1;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
