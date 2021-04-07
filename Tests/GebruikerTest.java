import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GebruikerTest
{
    Gebruiker user = new Gebruiker("tim","osman","tim123");

    @Test
    void getNaam() {
        Assertions.assertEquals("tim",user.getNaam());
    }

    @Test
    void setNaam() {
        user.setNaam("Jan Smit");
        Assertions.assertEquals("Jan Smit",user.getNaam());
    }

    @Test
    void getAchternaam() {
        Assertions.assertEquals("osman",user.getAchternaam());
    }

    @Test
    void setAchternaam() {
        user.setAchternaam("de beer");
        Assertions.assertEquals("de beer",user.getAchternaam());
    }

    @Test
    void getWachtwoord() {
        Assertions.assertEquals("tim123",user.getWachtwoord());
    }

    @Test
    void setWachtwoord() {
        user.setWachtwoord("osman123");
        Assertions.assertEquals("osman123",user.getWachtwoord());
    }
}
