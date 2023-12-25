package apps.ucu.edu.ua;

import lombok.*;

@Setter
@Getter
public class Client {
    private static int idCounter = 0;

    private int id;
    private String name;
    private int age;
    private String sex;

    public Client(String name, int age, String sex) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

}