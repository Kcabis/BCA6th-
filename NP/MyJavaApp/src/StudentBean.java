import java.io.Serializable;

// 1. Must implement Serializable
public class StudentBean implements Serializable {
    
    // 2. Private properties (Encapsulation)
    private int id;
    private String name;

    // 3. Public No-argument Constructor
    public StudentBean() {
    }

    // 4. Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}