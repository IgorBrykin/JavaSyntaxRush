package java.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private int weight;
        private String work;
        private String skills;
        private int height;

        public Human(String name, int age, int weight, String work, String skills, int height) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.work = work;
            this.skills = skills;
            this.height = height;
        }

        public Human(String name, int age, int weight, String work, String skills) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.work = work;
            this.skills = skills;
        }

        public Human(String name, int age, int weight, String work) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.work = work;
        }

        public Human(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age, String skills) {
            this.name = name;
            this.age = age;
            this.skills = skills;
        }

        public Human(String name, String skills) {
            this.name = name;
            this.skills = skills;
        }

        public Human(String name, String skills, int height) {
            this.name = name;
            this.skills = skills;
            this.height = height;
        }

        public Human(String name, int weight, String work, int height) {
            this.name = name;
            this.weight = weight;
            this.work = work;
            this.height = height;
        }
    }
}
