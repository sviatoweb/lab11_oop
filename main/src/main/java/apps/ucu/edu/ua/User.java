package apps.ucu.edu.ua;

import lombok.Builder;
import lombok.Data;

enum Gender {
    MALE, FEMALE
}

@Data
@Builder
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;

    public static void main(String[] args) {
        User user_1 = User.builder()
                .name("Oles")
                .age(25)
                .gender(Gender.MALE)
                .weight(70.5)
                .height(175.0)
                .build();

        User user_2 = User.builder()
                .name("Olesia")
                .gender(Gender.FEMALE)
                .build();
    }
}
