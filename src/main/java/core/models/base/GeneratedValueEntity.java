package core.models.base;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by oussama on 12/7/2015.
 */
@MappedSuperclass
public abstract class GeneratedValueEntity extends BaseEntity {
    private static final long serialVersionUID = -9015484905389214514L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public GeneratedValueEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

