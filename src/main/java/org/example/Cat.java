package org.example;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true) // Щоб equals/hashCode враховували поля Animal
@ToString(callSuper = true)          // Щоб toString виводив і поля Animal, і indoorOnly
public class Cat extends Animal {

    private boolean indoorOnly; // де живе котик

    // Твій конструктор за замовчуванням
    public Cat() {
        super("Кіт", 2); // Викликає конструктор Animal(String name, int age)
        this.indoorOnly = false;
    }
}