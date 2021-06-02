package academy.devdojo.javaoneforall.javacore.ZZKjunit.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {
    private Manga manga1;
    private Manga manga2;
    @BeforeEach
    public void setUp(){
        manga1 = new Manga("Kimetsu No Yaiba", 24);
        manga2 = new Manga("Kimetsu No Yaiba", 24);
    }

    @Test
    public void accessors_ReturnData_WhenInitialized(){
        Assertions.assertEquals("Kimetsu No Yaiba", manga1.name());
        Assertions.assertEquals(24, manga1.episodes());
    }

    @Test
    public void equals_ReturnTrue_WhenObjectsAreTheSame(){
        Assertions.assertEquals(manga1, manga2);
    }

    @Test
    public void hashCode_ReturnTheSameValue_WhenObjectsAreTheSame(){
        Assertions.assertEquals(manga1.hashCode(), manga2.hashCode());
    }

    @Test
    public void constructor_ThrowNullPointerException_WhenNameIsNull(){
       Assertions.assertThrows(NullPointerException.class,
               () -> new Manga(null, 24));
    }

    @Test
    public void isRecord_ReturnTrue_WhenCalledFromManga(){
        Assertions.assertTrue(Manga.class.isRecord());
    }
}