package core.models.base;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by oussama on 12/7/2015.
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = 2427304530836690365L;

    private Date TS_INSERT;
    private Date TS_UPDATE;

    public Date getTS_INSERT() {
        return TS_INSERT;
    }

    public void setTS_INSERT(Date tS_INSERT) {
        TS_INSERT = tS_INSERT;
    }

    public Date getTS_UPDATE() {
        return TS_UPDATE;
    }

    public void setTS_UPDATE(Date tS_UPDATE) {
        TS_UPDATE = tS_UPDATE;
    }
}

