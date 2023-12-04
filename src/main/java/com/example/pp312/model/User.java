package com.example.pp312.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @NotEmpty(message = "Имя не может быть пустым")
    @Pattern(regexp="^[а-яА-Яa-zA-Z]+$", message = "Используйте только русские или латинские буквы")
    @Size(min = 2, max = 30, message = "Количество символов должно быть от 2 до 30")
    private String name;

    @Column(name = "surname")
    @NotEmpty(message = "Фамилия не может быть пустой")
    @Pattern(regexp="^[а-яА-Яa-zA-Z]+$", message = "Используйте только русские или латинские буквы")
    @Size(min = 2, max = 30, message = "Количество символов должно быть от 2 до 30")
    private String surname;

    @Column(name = "age")
    @NotNull(message = "Вы не указали возраст не может быть пустой")
    @Min(value = 0, message = "Возраст должен быть положительным числом")
    private int age;

    @Column(name = "job")
    @NotEmpty(message = "Работа не может быть пустой")
    @Pattern(regexp="^[а-яА-Яa-zA-Z]+$", message = "Используйте только русские или латинские буквы")
    @Size(min = 2, max = 30, message = "Количество символов должно быть от 2 до 30")
    private String job;

    public User() {
    }
    public User(String name, String surname, int age, String job) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.job = job;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
