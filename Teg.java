import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "teg", schema = "note")
public class  Teg {

    @Id
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementor", strategy="increment")
    @Column(name = "idteg")
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
}



