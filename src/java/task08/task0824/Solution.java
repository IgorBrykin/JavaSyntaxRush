package java.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> grammy = new ArrayList<>();
        ArrayList<Human> parentsM = new ArrayList<>();
        ArrayList<Human> parentsW = new ArrayList<>();
        ArrayList<Human> children = new ArrayList<>();
        ArrayList<Human> noChildren = new ArrayList<>();
        Human grandfather = new Human("Дед Витя", true, 75, parentsM );
        Human grandfather1 = new Human("Дед Вася", true, 75,parentsW );
        grammy.add(grandfather);
        grammy.add(grandfather1);

        Human grandmother = new Human("Баба Маша", false, 75, parentsM);
        Human grandmother1 = new Human("Баба Катя", false, 75, parentsW);

        grammy.add(grandmother);
        grammy.add(grandmother1);

        Human mother = new Human("Маша", false, 35, children);
        Human father = new Human("Вова", true, 35, children);
        parentsW.add(mother);
        parentsM.add(father);

        Human c1 = new Human("Маша", false, 4, noChildren);
        Human c2 = new Human("Настя", false, 5, noChildren);
        Human c3 = new Human("Наташа", false, 3, noChildren);
        children.add(c1);
        children.add(c2);
        children.add(c3);

        System.out.println(grandfather.toString());
        System.out.println(grandfather1.toString());

        System.out.println(grandmother.toString());
        System.out.println(grandmother1.toString());

        System.out.println(father.toString());
        System.out.println(mother.toString());

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }




        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
