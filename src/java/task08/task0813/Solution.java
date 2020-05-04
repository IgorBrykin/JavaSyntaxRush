package java.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него
20 слов на букву "Л".


Требования:
1. Не изменяй заголовок метода createSet().
2. Программа не должна выводить текст на экран.
3. Программа не должна считывать значения с клавиатуры.
4. Метод createSet() должен создавать и возвращать
множество (реализация HashSet).
5. Множество из метода createSet() должно содержать
20 слов на букву «Л».
*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> set = new HashSet<>();
        set.add("Луна");
        set.add("Лапа");
        set.add("Лампа");
        set.add("Лувр");
        set.add("Любовь");
        set.add("Ложь");
        set.add("Ландыш");
        set.add("Лупа");
        set.add("Лимфоузел");
        set.add("Лимонад");
        set.add("Лимон");
        set.add("Лапух");
        set.add("Лист");
        set.add("Лось");
        set.add("Лошадь");
        set.add("Ложка");
        set.add("Лангет");
        set.add("Легкое");
        set.add("Ласточка");
        set.add("Лиса");
        return set;
    }

    public static void main(String[] args) {

    }
}
