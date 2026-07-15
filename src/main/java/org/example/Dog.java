package org.example;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true) // Змушує Lombok враховувати поля батьківського класу (Animal) при порівнянні
@ToString(callSuper = true)          // Змушує Lombok виводити поля Animal у методі toString()
public class Dog extends Animal {

    private String breed; // Порода собаки (властиве тільки для Dog)

    // Конструктор для створення собаки з усіма параметрами (ім'я, вік, порода)
    public Dog(String name, int age, String breed) {
        super(name, age); // Виклик конструктора батьківського класу Animal
        this.breed = breed;
    }
}