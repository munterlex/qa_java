package com.example;
import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
@Mock
Feline feline;

@Test
    public void testGetFood() throws Exception{
        Cat cat = new Cat(feline);
        Mockito.when(cat.getFood()).thenReturn(List.of("Животные","Птицы","Рыба"));
        List <String> actual = cat.getFood();
        List <String> expected = List.of("Животные","Птицы","Рыба");
        assertEquals(expected,actual);}

    @Test
    public void testGetSound() throws Exception{
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }
}
