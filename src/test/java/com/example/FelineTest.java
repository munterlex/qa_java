package com.example;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
@Test
public void testEatMeat() throws Exception{
    Feline feline = new Feline();
    List<String> expected = List.of("Животные", "Птицы", "Рыба");
    List<String> actual = feline.eatMeat();
    assertEquals(expected,actual);
}

@Test
    public void testGetFamily(){
    Feline feline = new Feline();
    String expected = "Кошачьи";
    String actual = feline.getFamily();
    assertEquals(expected,actual);
}
    @Test
            public void testGetKittens(){
        Feline feline = new Feline();
                assertEquals(1,feline.getKittens());
    }





}
