package java.task07.task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String),
пол(boolean), возраст(int), отец(Human),
мать(Human). Создай объекты и заполни их так,
чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString()
в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String),
пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public
Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public
Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human
(4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Human father = new Human("Alex", true, 33);
        Human mother = new Human("Nika", false, 37);
        Human grandfather = new Human("Vasily", true, 55);
        Human grandmother = new Human("Victoria", false, 56);
        Human daughter = new Human("Kate", false, 5, mother, father);
        Human daughterTwo = new Human("Nadean", false, 5, mother, father);
        Human daughterThree = new Human("Nadia", false, 5, mother, father);
        Human daughterFour = new Human("Valeria", false, 2, mother, father);
        Human daughterFive = new Human("Violeta", false, 2, mother, father);
        Human [] a = {father,mother,grandfather,grandmother,daughter,daughterTwo,daughterThree,daughterFour,daughterFive};
        for (Human human : a) {
            System.out.println(human);
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human mother;
        Human father;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human mother, Human father) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}