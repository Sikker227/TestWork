import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest extends User{

    @Nested
    @DisplayName("Создание объектов")
    class Objects {
        @Test
        @DisplayName("Без параметров")
        public void objectTest() {
            User user = new User();
        }
        @Test
        @DisplayName("С параметрами")
        public void objectTest2() {
            User user = new User("login", "e_mail");

        }
    }

    @Nested
    @DisplayName("Работа с пользователем")
    class Users {
        @Test
        @DisplayName("Установка адреса")
        public void getE_mailTest() {
            User user = new User();
            String e_mail = "qwerty123@mail.com";
            String userEmail = user.getE_mail("qwerty123@mail.com");
            assertEquals(userEmail, e_mail);
        }

        @Test
        @DisplayName("Установка логина")
        public void getLoginTest() {
            User user = new User();
            String log ="aggs12";
            String user_login = user.getLogin(log);
            assertEquals(user_login, log);
        }
    }



}
