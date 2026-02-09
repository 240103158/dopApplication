package ideaprojects.dop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.UUID;

@Entity
@Table(name = "groups")
@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "faculty", nullable = false, length = 55)
    private String faculty;

    @Column(name = "group_member", nullable = false)
    private int group_member;

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", faculty='" + faculty + '\'' +
                ", group_member=" + group_member +
                '}';
    }

}
