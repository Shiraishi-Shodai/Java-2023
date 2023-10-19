package 第3章.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> csvList = new ArrayList<>();
        csvList.add("田中 直樹,MAN");
        csvList.add("北村 一輝,MAN");
        csvList.add("加藤 しずか,WOMAN");
        csvList.add("小野 妹子,UNKNOWN");
        // １.エンティティを変換する。(map)
        //csvList.stream()でStreamオブジェクトを取得
        //mapで変換,collectでStreamで処理したオブジェクトをリストに格納という処理を繰り返す
        List<Person> persons = csvList.stream().map(Person::convertPersonFromCSV).collect(Collectors.toList());

        // 2.エンティティをフィルターする。(filter)
        List<Person> mens = persons.stream().filter(p -> p.getGender() == Gender.MAN).collect(Collectors.toList());

        System.out.println("Print all persons");
        persons.forEach(System.out::println);

        System.out.println("Print mens only");
        mens.forEach(p -> System.out.println(p.getName()));
    }

    enum Gender {
        MAN,
        WOMAN,
        UNKNOWN;
    }

    static class Person {
        private String name;
        private Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return String.format("My name is %s . \r\nMy gender is %s.", name, gender);
        }

        public String getName() {
            return this.name;
        }

        public Gender getGender() {
            return this.gender;
        }

        public static Person convertPersonFromCSV(String csv) {
            String[] csvStrings = csv.split(",");
            //IllegalArgumentExceptionは不正な引数、または不適切な引数をメソッドに渡したことを示すためにスローされる
            if (csvStrings.length != 2) throw new IllegalArgumentException("csv is illegal format.");
            return new Person(csvStrings[0], Gender.valueOf(csvStrings[1]));
        }
    }
}
