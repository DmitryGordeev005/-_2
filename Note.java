import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "note", schema = "note")
public class Note {

    @Id
    @Column(name = "idnote")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementor", strategy="increment")
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "text")
    private String text;
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    @Column(name = "user_iduser")
    private int user_iduser;
    public int getUser_iduser() {
        return user_iduser;
    }
    public void setUser_iduser(int user_iduser) {
        this.user_iduser = user_iduser;
    }

    @Column(name = "teg_idteg")
    private int teg_idteg;
    public int getTeg_idteg() {
        return teg_idteg;
    }
    public void setTeg_idteg(int teg_idteg) {
        this.teg_idteg = teg_idteg;
    }
}
