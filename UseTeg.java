import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UseTeg {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Note");
    EntityManager em = entityManagerFactory.createEntityManager();
    Teg teg = new Teg();

    public void saveTeg() {
        this.em.getTransaction().begin();
        this.em.persist(this.teg);
        this.em.getTransaction().commit();
        this.em.close();
    }

    public void addTeg(String name) {
        this.teg.setName(name);
        this.saveTeg();
    }

    public Teg getTeg(int id){
        return em.find(Teg.class, id);
    }

    public void deleteTeg(int id){
        em.getTransaction().begin();
        em.remove(getTeg(id));
        em.getTransaction().commit();
    }

    public void update(int id, String name) {
        this.teg.setId(id);
        this.teg.setName(name);
        em.getTransaction().begin();
        em.merge(teg);
        em.getTransaction().commit();
    }
}
