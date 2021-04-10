import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        UseUser user = new UseUser();

        user.addUser("Ivanow", "Ivan", "ivan@.ru", "ivan", "345f");
        user.deleteUser(2);
        user.update(1, "hto","Ivan", "ivan@.ru", "ivan", "345f");

        UseNote note = new UseNote();

        note.addNote("рецепт","сварить", 1,2);
        note.deleteNote(2);
        note.update(1,"курица","сварить", 1,2);

        UseTeg teg = new UseTeg();

        teg.addTeg("кулинария");
        teg.deleteTeg(2);
        teg.update(1,"варево");
    }
}