# 2023-autumn-ab-java-2-hw-2-mech-Maks
2023-autumn-ab-java-2-hw-2-mech-Maks created by GitHub Classroom


Дз:

Написать многомодульный проект, в котором:
1) В module-common лежит класс Person 
2) В module-1 лежит класс Car
3) В module-2 Main-класс, который при запуске создает экземпляр Person и на базе него созадет экземпляр Car, затем выводит созданный Car в консоль.

Требования: 
1) Кол-во зависимостей в pom.xml файлах должно быть минимальным (т.е ломбок должен быть подтянут в 1 месте, а не в каждом pom.xml файле. Лишняя зависимость - минус бал) (максимум 5 баллов)
2) Сконфигурировать фазу package таким образом, чтобы в корне в папке /target/bigJar создавался исполняемый jar-файл, который выполняет всю вышеуказанную логику (максимум 2 балла)
3) Использовать ломбок, но без @Data и каждая аннотация должна быть использована в коде. Если навешена лишняя аннотация (Например, @Data) но в коде нигде нет геттера к этому классу – минус балл. (максимум 3 балла)


public class Car {
  private final Person owner;
  private Quality quality = Quality.GOOD;
}


public class Person {
  private final String name;
  private final Sex sex;
  private Integer age;
}
