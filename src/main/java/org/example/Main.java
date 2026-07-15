package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Створюємо котика (конструктор за замовчуванням) ===");
        Cat defaultCat = new Cat();
        // Завдяки @ToString(callSuper = true) ми побачимо і дані Animal, і дані Cat
        System.out.println(defaultCat);

        System.out.println("\n=== Створюємо собаку (конструктор з параметрами) ===");
        Dog myDog = new Dog("Рекс", 3, "Німецька вівчарка");
        System.out.println(myDog);

        System.out.println("\n=== Тестуємо геттери та сеттери від Lombok ===");
        // Змінюємо ім'я собаки через автоматичний сеттер
        myDog.setName("Барон");
        System.out.println("Нове ім'я собаки: " + myDog.getName());

        // Змінюємо статус котика (виходитиме на вулицю)
        defaultCat.setIndoorOnly(true);
        System.out.println("Чи живе котик тільки вдома? " + (defaultCat.isIndoorOnly() ? "Так" : "Ні"));

        System.out.println("\n=== Оновлений список тварин ===");
        System.out.println(defaultCat);
        System.out.println(myDog);
    }
}