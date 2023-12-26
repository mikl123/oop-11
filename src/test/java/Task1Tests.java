import java.util.List;
import java.util.function.Consumer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.task1.Gender;
import com.example.task1.User;



public class Task1Tests {
    @Test
    public void testAllArguments() {
        User person1 = User.builder()
        .name("BOB")
        .age(32)
        .gender(Gender.MALE)
        .weight(89.1)
        .height(180)
        .interest("play")
        .interest("study")
        .build();
         Assertions.assertEquals(person1.getAge(), 32);
         Assertions.assertEquals(person1.getName(), "BOB");
         Assertions.assertEquals(person1.getGender(), Gender.MALE);
         Assertions.assertEquals(person1.getHeight(),180.0);
         Assertions.assertEquals(person1.getWeight(), 89.1);
         Assertions.assertEquals(person1.getInterests(),List.of("play","study"));
    }
     @Test
    public void testFewArguments() {
        User person2= User.builder()
        .name("BOB")
        .age(32)
        .gender(Gender.MALE)
        .build();
         Assertions.assertEquals(person2.getAge(), 32);
         Assertions.assertEquals(person2.getName(), "BOB");
         Assertions.assertEquals(person2.getGender(), Gender.MALE);
         Assertions.assertEquals(person2.getHeight(),0);
         Assertions.assertEquals(person2.getWeight(),0);
         Assertions.assertEquals(person2.getInterests(),List.of());
    }

}