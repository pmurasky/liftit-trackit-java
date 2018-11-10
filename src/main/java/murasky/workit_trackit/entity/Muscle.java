package murasky.workit_trackit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "muscles")
public class Muscle {

    @Id
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    public String getName() {
        return name;
    }
}
