import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UseNote {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Note");
    EntityManager em = entityManagerFactory.createEntityManager();
    Note note = new Note();

    public void saveNote() {
        this.em.getTransaction().begin();
        this.em.persist(this.note);
        this.em.getTransaction().commit();
        this.em.close();
    }

    public void addNote(String name, String txt, int idus, int idteg) {
        this.note.setName(name);
        this.note.setText(txt);
        this.note.setUser_iduser(idus);
        this.note.setTeg_idteg(idteg);
        this.saveNote();
    }

    public Note getNote(int id){
        return em.find(Note.class, id);
    }

    public void deleteNote(int id){
        em.getTransaction().begin();
        em.remove(getNote(id));
        em.getTransaction().commit();
    }

    public void update(int id, String name, String txt, int idus, int idteg) {
        this.note.setId(id);
        this.note.setName(name);
        this.note.setText(txt);
        this.note.setUser_iduser(idus);
        this.note.setTeg_idteg(idteg);
        em.getTransaction().begin();
        em.merge(note);
        em.getTransaction().commit();
    }
}
