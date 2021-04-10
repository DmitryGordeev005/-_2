import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UseUser {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Note");
    EntityManager em = entityManagerFactory.createEntityManager();
    User user = new User();

    public void saveUser() {
        this.em.getTransaction().begin();
        this.em.persist(this.user);
        this.em.getTransaction().commit();
        this.em.close();
    }

    public void addUser(String surname, String name, String email, String login, String password) {
        this.user.setSurname(surname);
        this.user.setName(name);
        this.user.setEmail(email);
        this.user.setLogin(login);
        this.user.setPassword(password);
        this.saveUser();
    }

    public User getUser(int id){
        return em.find(User.class, id);
    }

    public void deleteUser(int id){
            em.getTransaction().begin();
            em.remove(getUser(id));
            em.getTransaction().commit();
    }

    public void update(int id, String surname, String name, String email, String login, String password) {
        this.user.setId(id);
        this.user.setSurname(surname);
        this.user.setName(name);
        this.user.setEmail(email);
        this.user.setLogin(login);
        this.user.setPassword(password);
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
    }
}
