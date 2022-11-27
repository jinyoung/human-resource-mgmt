package human.resource.mgmt.query;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="Schedule_table")
@Data
public class Schedule {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String userId;
        private String dateId;


}
