    /*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
         из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.

      2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный
        справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
        учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
        выводиться все телефоны. Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие
        с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"банан", "яблоко", "лимон", "апельсин", "слива", "апельсин", "вишня", "слива", "абрикос", "вишня"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        Phonebook pb = new Phonebook();

        pb.add("Абрамов", "+7(999)987-65-43");
        pb.add("Абрамов", "+7(926)147-25-36");
        pb.add("Борисов", "+7(926)123-45-67");
        pb.add("Васильев", "+7(901)187-35-00");
        pb.add("Головин", "+7(962)479-21-18");
        pb.add("Головин", "+7(900)000-47-85");
        pb.add("Дьяков", "+7(954)170-55-44");
        pb.add("Егоров", "+7(901)752-22-22");


        System.out.println("Выборка абонентов с фамилией Абрамов:");
        System.out.println(pb.get("Абрамов"));

        System.out.println();

        System.out.println("Выборка абонентов с фамилией Головин:");
        System.out.println(pb.get("Головин"));
    }
}

