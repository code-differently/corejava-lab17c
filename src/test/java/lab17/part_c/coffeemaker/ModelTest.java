package lab17.part_c.coffeemaker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModelTest {

    @Test
    public void constructorTest01(){
        // Given
        Model model = new Model("xyz", "123");
        // When

        String expected = "xyz 123";
        String actual = model.toString();
        // Then

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        Model model = new Model("xyz", "123");

        String expected = "xyz";
        String actual = model.getName();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getNumberTest(){
        Model model = new Model("xyz", "123");

        String expected = "123";
        String actual = model.getNumber();

        Assertions.assertEquals(expected,actual);
    }
}
