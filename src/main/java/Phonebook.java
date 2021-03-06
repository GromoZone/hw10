/*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
     из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.

  2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный
    справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
    учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
    выводиться все телефоны. Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие
    с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Phonebook {
    private Map<String, HashSet<String>> map;

    Phonebook() {
        this.map = new HashMap<>();
    }

    void add(String lastName, String phone) {
        HashSet<String> numbers;

        if (map.containsKey(lastName)) {
            numbers = map.get(lastName);
        } else {
            numbers = new HashSet<>();
        }

        numbers.add(phone);
        map.put(lastName, numbers);

    }

    HashSet<String> get(String lastName) {
        return map.get(lastName);
    }
}
